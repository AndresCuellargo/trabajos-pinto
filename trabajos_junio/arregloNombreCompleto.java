package arreglos;
import java.util.Scanner;
public class arregloNombreCompleto {
    public static void main(String[] args) {
        String[] nombre1 = new String[2];
        String[] nombre2 = new String[2];
        String[] apellido1 = new String[2];
        String[] apellido2 = new String[2];
        String[] nombreCompleto = new String[2];

        Scanner teclado = new Scanner(System.in);

        for (int x = 0; x < 2; x++) {
            
            System.out.println("Introduce un nombre uno: " + (x + 1));
            nombre1[x] = teclado.nextLine();

            System.out.println("ingrrese nombre dos: " + (x+1));
            nombre2[x] = teclado.nextLine();

            System.out.println("Introduce un apellido uno: " + (x + 1));
            apellido1[x] = teclado.nextLine();

            System.out.println("Introduce un apellido dos: " + (x + 1));
            apellido2[x] = teclado.nextLine();

            nombreCompleto[x] = nombre1[x] + " " + nombre2[x] + " " + apellido1[x] + " " + apellido2[x];
        }

        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(nombreCompleto[i]);
        }
    }
}
