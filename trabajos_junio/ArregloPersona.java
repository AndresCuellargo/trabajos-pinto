package arreglos;

import java.util.Scanner;

public class ArregloPersona {
    //nombre,nuero de telefono,edad,rh,ti o cc, correo, direccion,apellido
    public static void main(String[] args) {
        String[] nombre = new String[10];
        String[] apellido = new String[10];
        String[] telefono = new String[10];
        int[] edad = new int[10];
        String[] RH = new String[10];
        String[] TIOCC = new String[10];
        String[] correo = new String[10];
        String[] direccion = new String[10];
    

        Scanner teclado = new Scanner(System.in);

        for (int x = 0; x < 1; x++){
            System.out.println("Introduce un nombre: " + (x + 1));
            nombre[x] = teclado.nextLine();

            System.out.println("ingrese su apellido: " + (x+1));
            apellido[x] = teclado.nextLine();
            
            System.out.println("ingrese numero de telefono: " + (x+1));
            telefono[x] = teclado.nextLine();

            System.out.println("ingrese su edad: " + (x+1));
            edad[x] = teclado.nextInt();

            System.out.println("ingrese su RH: " + (x+1));
            RH[x] = teclado.next();

            System.out.println("ingrese su tipo de documento TI o CC: " + (x+1));
            TIOCC[x] = teclado.next();

            System.out.println("ingrese su correo: " + (x+1));
            correo[x] = teclado.next();

            System.out.println("ingrese su direccion: " + (x+1));
            direccion[x] = teclado.next();


        }
        System.out.println("----------------------------");
        for (int i = 0; i < 1; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.println("Nombre completo: " + nombre[i] + " " + apellido[i]);
            System.out.println("Teléfono: " + telefono[i]);
            System.out.println("Edad: " + edad[i]);
            System.out.println("RH: " + RH[i]);
            System.out.println("Tipo de documento: " + TIOCC[i]);
            System.out.println("Correo: " + correo[i]);
            System.out.println("Dirección: " + direccion[i]);
            System.out.println("----------------------------");
        }
        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = teclado.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < 1; i++) {
            if (nombre[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("¡Persona encontrada!");
                System.out.println("Nombre completo: " + nombre[i] + " " + apellido[i]);
                System.out.println("Teléfono: " + telefono[i]);
                System.out.println("Edad: " + edad[i]);
                System.out.println("RH: " + RH[i]);
                System.out.println("Tipo de documento: " + TIOCC[i]);
                System.out.println("Correo: " + correo[i]);
                System.out.println("Dirección: " + direccion[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Persona no encontrada con el nombre: " + nombreBuscado);
        }

    }
}
