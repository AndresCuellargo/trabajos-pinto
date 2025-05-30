import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese la edad del primer hermano:");
            int edad1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese la edad del segundo hermano:");
            int edad2 = Integer.parseInt(scanner.nextLine());

            int diferencia = Math.abs(edad1 - edad2); // Calculamos la diferencia absoluta

            if (edad1 > edad2) {
                System.out.println("El primer hermano es el mayor por " + diferencia + " años.");
            } else if (edad2 > edad1) {
                System.out.println("El segundo hermano es el mayor por " + diferencia + " años.");
            } else {
                System.out.println("Ambos hermanos tienen la misma edad.");
            }

        }
    }
}
