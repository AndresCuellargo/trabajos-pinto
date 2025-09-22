
create database bd_alerta_mujer;
use bd_alerta_mujer;

create table usuarios (
    id_usuario int primary key auto_increment,
    nombre varchar(255) unique not null,
    email nvarchar(150) unique,
    contrasena_hash varchar(255) not null,
    fecha_nacimiento datetime not null,
    estado_usuario tinyint(1) default 1, -- 1 activo, 0 inactivo
    fecha_creacion datetime default current_timestamp,
    ultimo_acceso datetime
);

create table contactos (
    id_contacto int primary key auto_increment,
    nombre varchar(80) not null,
    telefono varchar(15) unique not null
);
    
create table roles (
    id_rol int primary key auto_increment,
    nombre_rol varchar(50) unique not null, -- ej: admin - usuario 
    descripcion varchar(255)
);

create table permisos (
    id_permiso int primary key auto_increment,
    nombre_permiso varchar(50) unique not null, -- ej: 'select', 'insert', 'update', 'delete'
    descripcion varchar(255)
);

create table alertas(
    id_alerta int primary key auto_increment,
    id_usuario int,
    fecha datetime default current_timestamp,
    imagen mediumblob,
    audio longblob,
    mensaje varchar(250) not null,
    foreign key (id_usuario) references usuarios (id_usuario)
);

create table ubicaciones (
    id_ubicacion int primary key auto_increment,
    id_alerta int not null,
    id_usuario int not null,
    latitud decimal(10,7) not null,
    longitud decimal(10,7) not null,
    foreign key (id_alerta) references alertas(id_alerta),
    foreign key (id_usuario) references usuarios(id_usuario) 
);

create table unidades_respuestas (
    id_unidad int primary key auto_increment,
    nombre_unidad varchar(250) not null,
    tipounidad varchar(150) not null,
    telefono varchar(30) not null,
    email varchar(150)
);

create table dispositivos(
    id_dispositivo int primary key auto_increment,
    os_version varchar(50)
);




-- pivote's

create table usuarios_roles (
    id_ur int primary key auto_increment,
    id_usuario int not null,
    id_rol int not null,
    fechaasignacion datetime default current_timestamp,
    foreign key (id_usuario) references usuarios(id_usuario),
    foreign key (id_rol) references roles(id_rol)
);
    
create table eleccion_unidades(
	id_eu int primary key auto_increment,
    id_usuario int,
    id_unidad int,
    foreign key (id_usuario) references usuarios(id_usuario),
    foreign key (id_unidad) references unidades_respuestas(id_unidad)
    
);
create table dispositivos_usuarios(
	id_du int primary key auto_increment,
    id_usuario int not null,
    id_dispositivo int not null,
    permisos boolean, -- {camara:true,ubicacion:true,microfono:true}
    fecha_ingreso datetime default current_timestamp,
    foreign key (id_usuario) references usuarios (id_usuario),
    foreign key (id_dispositivo) references dispositivos (id_dispositivo)
);

create table usuarios_contactos(
    id_uc int primary key auto_increment,
    id_usuario int,
    id_contacto int,
	parentesco nvarchar(150),
    foreign key (id_usuario) references usuarios(id_usuario),
    foreign key (id_contacto) references contactos(id_contacto)
);

create table roles_permisos (
    id_rp int primary key auto_increment,
    id_rol int,
    id_permiso int,
    fechaasignacion datetime default current_timestamp,
    foreign key (id_rol) references roles(id_rol),
    foreign key (id_permiso) references permisos(id_permiso)
);




-- configuraciones, gestion de login, errores y contraseñas

create table configuraciones_seguridad (
    id_configuracion int primary key auto_increment,
    nombreconfiguracion varchar(100),
    valorconfiguracion varchar(100),
    descripcion varchar(255)
);

create table sesion_usuarios (
    id_sesion int primary key auto_increment,
    id_usuario int,
    fechainicio datetime default current_timestamp,
    fechafin datetime,
    ip_origen varchar(50),
    estadosesion varchar(50), -- 'activo', 'cerrado'
    foreign key (id_usuario) references usuarios(id_usuario)
);

create table log_errores (
    id_error int primary key auto_increment,
    fecha datetime default current_timestamp,
    id_usuario int,
    tipoerror varchar(100), -- ej: 'intento de acceso fallido', 'contraseña incorrecta'
    descripcion varchar(500),
    ip_origen varchar(50),
    foreign key (id_usuario) references usuarios(id_usuario)
);

create table politicas_contrasenas (
    id_politica int primary key auto_increment,
    minlongitud int default 8,
    maxlongitud int default 20,
    requiere_mayusculas tinyint(1) default 1,
    requiere_numeros tinyint(1) default 1,
    requiere_simbolos tinyint(1) default 1,
    caducidad_dias int default 90
);


-- indices sugeridos para mejorar joins y filtros
create index ix_usuarios_email on usuarios (email);
create index ix_usuarios_estado on usuarios (estado_usuario);
create index ix_usuarios_ultimo_acceso on usuarios (ultimo_acceso);

create index ix_alertas_usuario_fecha on alertas (id_usuario, fecha);
create index ix_ubicaciones_alerta on ubicaciones (id_alerta);
create index ix_ubicaciones_usuario on ubicaciones (id_usuario);
create index ix_ubicaciones_geo on ubicaciones (latitud, longitud);

create index ix_usuarios_roles_usuario on usuarios_roles (id_usuario);
create index ix_usuarios_roles_rol on usuarios_roles (id_rol);
alter table usuarios_roles add constraint uq_usuarios_roles unique (id_usuario, id_rol);

create index ix_roles_permisos_rol on roles_permisos (id_rol);
create index ix_roles_permisos_permiso on roles_permisos (id_permiso);
alter table roles_permisos add constraint uq_roles_permisos unique (id_rol, id_permiso);

create index ix_eleccion_unidades_usuario on eleccion_unidades (id_usuario);
create index ix_eleccion_unidades_unidad on eleccion_unidades (id_unidad);
alter table eleccion_unidades add constraint uq_eleccion_unidad unique (id_usuario, id_unidad);

create index ix_dispositivos_usuarios_usuario on dispositivos_usuarios (id_usuario);
create index ix_dispositivos_usuarios_disp on dispositivos_usuarios (id_dispositivo);
alter table dispositivos_usuarios add constraint uq_dispositivos_usuarios unique (id_usuario, id_dispositivo);

create index ix_usuarios_contactos_usuario on usuarios_contactos (id_usuario);
create index ix_usuarios_contactos_contacto on usuarios_contactos (id_contacto);
alter table usuarios_contactos add constraint uq_usuarios_contactos unique (id_usuario, id_contacto);

create index ix_sesion_usuarios_usuario on sesion_usuarios (id_usuario);
create index ix_sesion_usuarios_estado on sesion_usuarios (estadosesion, fechafin);

create index ix_log_errores_usuario on log_errores (id_usuario);
create index ix_log_errores_tipo on log_errores (tipoerror);


-- view

create or replace view vw_usuarios_basico as
select
  u.id_usuario,
  u.nombre,
  u.email,
  u.estado_usuario,
  u.fecha_creacion,
  u.ultimo_acceso
from usuarios u;

create or replace view vw_usuarios_roles as
select
  u.id_usuario,
  u.nombre as usuario,
  r.id_rol,
  r.nombre_rol as rol,
  ur.fechaasignacion
from usuarios u
join usuarios_roles ur on ur.id_usuario = u.id_usuario
join roles r on r.id_rol = ur.id_rol;

create or replace view vw_roles_permisos as
select
  r.id_rol,
  r.nombre_rol as rol,
  p.id_permiso,
  p.nombre_permiso as permiso,
  rp.fechaasignacion
from roles r
join roles_permisos rp on rp.id_rol = r.id_rol
join permisos p on p.id_permiso = rp.id_permiso;

create or replace view vw_alertas_detalle as
select
  a.id_alerta,
  a.fecha,
  a.mensaje,
  u.id_usuario,
  u.nombre as usuario,
  ub.id_ubicacion,
  ub.latitud,
  ub.longitud
from alertas a
join usuarios u on u.id_usuario = a.id_usuario
left join ubicaciones ub on ub.id_alerta = a.id_alerta;

create or replace view vw_sesiones_activas as
select
  s.id_sesion,
  s.id_usuario,
  s.fechainicio,
  s.ip_origen
from sesion_usuarios s
where s.estadosesion = 'activo' and s.fechafin is null;

create or replace view vw_dispositivos_usuarios as
select
  du.id_du,
  u.id_usuario,
  u.nombre as usuario,
  d.id_dispositivo,
  d.os_version,
  du.permisos,
  du.fecha_ingreso
from dispositivos_usuarios du
join usuarios u on u.id_usuario = du.id_usuario
join dispositivos d on d.id_dispositivo = du.id_dispositivo;

create or replace view vw_contactos_por_usuario as
select
  uc.id_uc,
  u.id_usuario,
  u.nombre as usuario,
  c.id_contacto,
  c.nombre as contacto,
  c.telefono,
  uc.parentesco
from usuarios_contactos uc
join usuarios u on u.id_usuario = uc.id_usuario
join contactos c on c.id_contacto = uc.id_contacto;




delimiter //

create function fn_valida_politica_contrasena(p_contrasena varchar(255))
returns tinyint
deterministic
begin
  declare v_min int default 8;
  declare v_max int default 20;
  declare v_req_may tinyint default 1;
  declare v_req_num tinyint default 1;
  declare v_req_sim tinyint default 1;
  declare v_ok tinyint default 1;

  select
    coalesce(minlongitud, v_min),
    coalesce(maxlongitud, v_max),
    coalesce(requiere_mayusculas, v_req_may),
    coalesce(requiere_numeros, v_req_num),
    coalesce(requiere_simbolos, v_req_sim)
  into v_min, v_max, v_req_may, v_req_num, v_req_sim
  from politicas_contrasenas
  order by id_politica desc
  limit 1;

  if char_length(p_contrasena) < v_min or char_length(p_contrasena) > v_max then
    set v_ok = 0;
  end if;

  if v_req_may = 1 and p_contrasena not regexp '[[:upper:]]' then
    set v_ok = 0;
  end if;

  if v_req_num = 1 and p_contrasena not regexp '[0-9]' then
    set v_ok = 0;
  end if;

  if v_req_sim = 1 and p_contrasena not regexp '[^a-z[:upper:][:digit:]]' then
    set v_ok = 0;
  end if;

  return v_ok;
end//

delimiter ;



-- triggers


delimiter //

create trigger trg_usuarios_bi
before insert on usuarios
for each row
begin
  if new.email is not null then
    set new.email = lower(trim(new.email));
  end if;

  if new.fecha_nacimiento > current_timestamp then
    signal sqlstate '45000' set message_text = 'fecha_nacimiento no puede ser futura';
  end if;

  if new.estado_usuario is null then
    set new.estado_usuario = 1;
  end if;

  if new.fecha_creacion is null then
    set new.fecha_creacion = current_timestamp;
  end if;
end//

create trigger trg_usuarios_bu
before update on usuarios
for each row
begin
  if new.email is not null then
    set new.email = lower(trim(new.email));
  end if;

  if new.fecha_nacimiento > current_timestamp then
    signal sqlstate '45000' set message_text = 'fecha_nacimiento no puede ser futura';
  end if;
end//

create trigger trg_sesion_ai
after insert on sesion_usuarios
for each row
begin
  if new.estadosesion is null then
    update sesion_usuarios set estadosesion = 'activo' where id_sesion = new.id_sesion;
  end if;

  update usuarios
  set ultimo_acceso = coalesce(new.fechainicio, current_timestamp)
  where id_usuario = new.id_usuario;
end//

create trigger trg_sesion_bu
before update on sesion_usuarios
for each row
begin
  if new.fechafin is not null then
    set new.estadosesion = 'cerrado';
  end if;
end//

create trigger trg_alertas_bi
before insert on alertas
for each row
begin
  if new.id_usuario is null then
    signal sqlstate '45000' set message_text = 'id_usuario es obligatorio en alertas';
  end if;

  if new.mensaje is null or char_length(trim(new.mensaje)) = 0 then
    signal sqlstate '45000' set message_text = 'mensaje es obligatorio en alertas';
  end if;
end//

create trigger trg_ubicaciones_bi
before insert on ubicaciones
for each row
begin
  if new.latitud < -90 or new.latitud > 90 then
    signal sqlstate '45000' set message_text = 'latitud fuera de rango';
  end if;
  if new.longitud < -180 or new.longitud > 180 then
    signal sqlstate '45000' set message_text = 'longitud fuera de rango';
  end if;
end//

create trigger trg_contactos_bi
before insert on contactos
for each row
begin
  set new.nombre = trim(new.nombre);
  set new.telefono = trim(new.telefono);
end//

create trigger trg_dispositivos_bi
before insert on dispositivos
for each row
begin
  if new.os_version is not null then
    set new.os_version = trim(new.os_version);
  end if;
end//

delimiter ;


-- procedures

delimiter //

create procedure sp_crear_usuario(
  in p_nombre varchar(255),
  in p_email nvarchar(150),
  in p_contrasena_hash varchar(255),
  in p_fecha_nacimiento datetime,
  out p_id_usuario int
)
begin
  declare v_exists int;

  if p_nombre is null or char_length(trim(p_nombre)) = 0 then
    signal sqlstate '45000' set message_text = 'nombre obligatorio';
  end if;

  select count(*) into v_exists from usuarios where nombre = p_nombre;
  if v_exists > 0 then
    signal sqlstate '45000' set message_text = 'nombre ya existe';
  end if;

  if p_email is not null then
    select count(*) into v_exists from usuarios where email = lower(trim(p_email));
    if v_exists > 0 then
      signal sqlstate '45000' set message_text = 'email ya existe';
    end if;
  end if;

  insert into usuarios (nombre, email, contrasena_hash, fecha_nacimiento, estado_usuario)
  values (trim(p_nombre), case when p_email is null then null else lower(trim(p_email)) end, p_contrasena_hash, p_fecha_nacimiento, 1);

  set p_id_usuario = last_insert_id();
end//

create procedure sp_asignar_rol(
  in p_id_usuario int,
  in p_id_rol int
)
begin
  declare v_u int;
  declare v_r int;

  select count(*) into v_u from usuarios where id_usuario = p_id_usuario;
  if v_u = 0 then signal sqlstate '45000' set message_text = 'usuario no existe'; end if;

  select count(*) into v_r from roles where id_rol = p_id_rol;
  if v_r = 0 then signal sqlstate '45000' set message_text = 'rol no existe'; end if;

  insert ignore into usuarios_roles (id_usuario, id_rol) values (p_id_usuario, p_id_rol);
end//

create procedure sp_otorgar_permiso_a_rol(
  in p_id_rol int,
  in p_id_permiso int
)
begin
  declare v_r int;
  declare v_p int;

  select count(*) into v_r from roles where id_rol = p_id_rol;
  if v_r = 0 then signal sqlstate '45000' set message_text = 'rol no existe'; end if;

  select count(*) into v_p from permisos where id_permiso = p_id_permiso;
  if v_p = 0 then signal sqlstate '45000' set message_text = 'permiso no existe'; end if;

  insert ignore into roles_permisos (id_rol, id_permiso) values (p_id_rol, p_id_permiso);
end//

create procedure sp_iniciar_sesion(
  in p_id_usuario int,
  in p_ip varchar(50),
  out p_id_sesion int
)
begin
  declare v_u int;
  select count(*) into v_u from usuarios where id_usuario = p_id_usuario and estado_usuario = 1;
  if v_u = 0 then signal sqlstate '45000' set message_text = 'usuario inactivo o inexistente'; end if;

  insert into sesion_usuarios (id_usuario, ip_origen, estadosesion)
  values (p_id_usuario, p_ip, 'activo');

  set p_id_sesion = last_insert_id();
end//

create procedure sp_cerrar_sesion(
  in p_id_sesion int
)
begin
  update sesion_usuarios
  set fechafin = current_timestamp
  where id_sesion = p_id_sesion and fechafin is null;

  if row_count() = 0 then
    signal sqlstate '45000' set message_text = 'sesion inexistente o ya cerrada';
  end if;
end//

create procedure sp_registrar_alerta(
  in p_id_usuario int,
  in p_mensaje varchar(250),
  in p_imagen mediumblob,
  in p_audio longblob,
  in p_latitud decimal(10,7),
  in p_longitud decimal(10,7),
  out p_id_alerta int,
  out p_id_ubicacion int
)
begin
  declare v_u int;
  start transaction;

  select count(*) into v_u from usuarios where id_usuario = p_id_usuario and estado_usuario = 1;
  if v_u = 0 then
    rollback;
    signal sqlstate '45000' set message_text = 'usuario inactivo o inexistente';
  end if;

  insert into alertas (id_usuario, imagen, audio, mensaje)
  values (p_id_usuario, p_imagen, p_audio, trim(p_mensaje));

  set p_id_alerta = last_insert_id();

  insert into ubicaciones (id_alerta, id_usuario, latitud, longitud)
  values (p_id_alerta, p_id_usuario, p_latitud, p_longitud);

  set p_id_ubicacion = last_insert_id();

  commit;
end//

create procedure sp_agregar_contacto_usuario(
  in p_id_usuario int,
  in p_nombre varchar(80),
  in p_telefono varchar(15),
  in p_parentesco nvarchar(150),
  out p_id_contacto int
)
begin
  declare v_u int;
  declare v_c int;

  select count(*) into v_u from usuarios where id_usuario = p_id_usuario;
  if v_u = 0 then signal sqlstate '45000' set message_text = 'usuario no existe'; end if;

  -- reutiliza contacto si telefono ya existe
  select id_contacto into p_id_contacto from contactos where telefono = trim(p_telefono) limit 1;

  if p_id_contacto is null then
    insert into contactos (nombre, telefono) values (trim(p_nombre), trim(p_telefono));
    set p_id_contacto = last_insert_id();
  end if;

  insert ignore into usuarios_contactos (id_usuario, id_contacto, parentesco)
  values (p_id_usuario, p_id_contacto, p_parentesco);
end//

create procedure sp_enlazar_dispositivo_usuario(
  in p_id_usuario int,
  in p_os_version varchar(50),
  in p_permisos boolean,
  out p_id_dispositivo int,
  out p_id_du int
)
begin
  declare v_u int;
  select count(*) into v_u from usuarios where id_usuario = p_id_usuario;
  if v_u = 0 then signal sqlstate '45000' set message_text = 'usuario no existe'; end if;

  insert into dispositivos (os_version) values (p_os_version);
  set p_id_dispositivo = last_insert_id();

  insert into dispositivos_usuarios (id_usuario, id_dispositivo, permisos)
  values (p_id_usuario, p_id_dispositivo, p_permisos);

  set p_id_du = last_insert_id();
end//

create procedure sp_registrar_error(
  in p_id_usuario int,
  in p_tipoerror varchar(100),
  in p_descripcion varchar(500),
  in p_ip varchar(50)
)
begin
  insert into log_errores (id_usuario, tipoerror, descripcion, ip_origen)
  values (p_id_usuario, trim(p_tipoerror), trim(p_descripcion), p_ip);
end//

delimiter ;


