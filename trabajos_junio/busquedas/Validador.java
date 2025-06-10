package busquedaPersonas;

public class Validador {
    public static boolean celularExiste(String cel) {
        for (int i = 0; i < Datos.cantidad; i++) {
            if (Datos.celular[i].equalsIgnoreCase(cel)) {
                System.out.println("Celular ya registrado");
                return true;
            }
        }
        return false;
    }

    public static boolean emailExiste(String mail) {
        for (int i = 0; i < Datos.cantidad; i++) {
            if (Datos.email[i].equalsIgnoreCase(mail)) {//el equals sirve para q no se repitsn los datos
                System.out.println("Email ya registrado");
                return true;
            }
        }
        return false;
}
}
