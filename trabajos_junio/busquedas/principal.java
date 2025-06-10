package busquedaPersonas;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Ingresar persona");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Buscar persona");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Persona.agregarPersona(sc);
                    break;
                case 2:
                    Mostrar.mostrarTodo();
                    break;
                case 3:
                    Buscador.buscar(sc);
                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("numero mal ingresado seleccione los q se le indica");
            }
        } while (opcion != 0);
    }
    }

