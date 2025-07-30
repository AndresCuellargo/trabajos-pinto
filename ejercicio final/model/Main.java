
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // REGIONAL, CENTRO, SEDE
                System.out.println("=== Registrar Ubicación ===");
                System.out.print("Regional: ");
                String nombreRegional = scanner.nextLine();
                Regional regional = new Regional(nombreRegional);

                System.out.print("Centro: ");
                String nombreCentro = scanner.nextLine();
                Centro centro = new Centro(nombreCentro);

                System.out.print("Sede: ");
                String nombreSede = scanner.nextLine();
                Sede sede = new Sede(nombreSede);

                Ubicacion ubicacion = new Ubicacion(regional, centro, sede);

                // LINEA Y PROGRAMA
                System.out.println("\n=== Registrar Línea y Programa de Formación ===");
                System.out.print("Línea de Formación: ");
                String nombreLinea = scanner.nextLine();
                LineaFormacion linea = new LineaFormacion(nombreLinea);

                System.out.print("Programa de Formación: ");
                String nombrePrograma = scanner.nextLine();
                ProgramaFormacion programa = new ProgramaFormacion(nombrePrograma);
                linea.agregarPrograma(programa);

                // AMBIENTE
                System.out.println("\n=== Registrar Ambiente ===");
                System.out.print("Descripción del ambiente: ");
                String descripcionAmbiente = scanner.nextLine();

                System.out.print("¿Es especializado? (true/false): ");
                boolean especializado = scanner.nextBoolean();

                System.out.print("Capacidad: ");
                int capacidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                Ambiente ambiente = new Ambiente(descripcionAmbiente, especializado, capacidad);

                // INSTRUCTOR
                System.out.println("\n=== Registrar Instructor ===");
                System.out.print("Nombre Instructor: ");
                String nombreInstructor = scanner.nextLine();

                System.out.print("Identificación Instructor: ");
                String idInstructor = scanner.nextLine();

                Instructor instructor = new Instructor(nombreInstructor, idInstructor);
                instructor.asignarLinea(linea);
                instructor.asignarPrograma(programa);
                instructor.asignarAmbiente(ambiente);

                System.out.print("Horario Instructor (MAÑANA/TARDE/NOCHE): ");
                String jornadaInstr = scanner.nextLine().toUpperCase();
                instructor.asignarHorario(new Horario(Jornada.valueOf(jornadaInstr)));

                // APRENDIZ
                System.out.println("\n=== Registrar Aprendiz ===");
                System.out.print("Nombre Aprendiz: ");
                String nombreAprendiz = scanner.nextLine();

                System.out.print("Identificación Aprendiz: ");
                String idAprendiz = scanner.nextLine();

                Aprendiz aprendiz = new Aprendiz(nombreAprendiz, idAprendiz);
                aprendiz.asignarLinea(linea);
                aprendiz.asignarPrograma(programa);
                aprendiz.asignarAmbiente(ambiente);

                System.out.print("Horario Aprendiz (MAÑANA/TARDE/NOCHE): ");
                String jornadaApr = scanner.nextLine().toUpperCase();
                aprendiz.asignarHorario(new Horario(Jornada.valueOf(jornadaApr)));

                // COORDINADOR
                System.out.println("\n=== Registrar Coordinador ===");
                System.out.print("Nombre Coordinador: ");
                String nombreCoord = scanner.nextLine();

                System.out.print("Identificación Coordinador: ");
                String idCoord = scanner.nextLine();

                Coordinador coordinador = new Coordinador(nombreCoord, idCoord);
                coordinador.asignarInstructor(instructor);

                // MOSTRAR RESUMEN
                System.out.println("\n=== RESUMEN REGISTRADO ===");
                System.out.println("Ubicación: " + ubicacion.getRegional().getNombre() + " - "
                                + ubicacion.getCentro().getNombre() + " - " + ubicacion.getSede().getNombre());
                System.out.println("Línea: " + linea.getNombre());
                System.out.println("Programa: " + programa.getNombre());
                System.out.println("Ambiente: " + ambiente.getDescripcion() + " | Especializado: "
                                + ambiente.isEspecializado()
                                + " | Capacidad: " + ambiente.getCapacidad());
                System.out.println("Instructor: " + instructor.getNombre() + " | ID: " + instructor.getIdentificacion()
                                + " | Jornada: " + instructor.getHorario().getJornada());
                System.out.println("Aprendiz: " + aprendiz.getNombre() + " | ID: " + aprendiz.getIdentificacion()
                                + " | Jornada: " + aprendiz.getHorario().getJornada());
                System.out.println("Coordinador: " + coordinador.getNombre() + " | ID: "
                                + coordinador.getIdentificacion());

                scanner.close();
        }
}
