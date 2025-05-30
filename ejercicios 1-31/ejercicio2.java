import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese el primer número:");
            int N1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el segundo número:");
            int N2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el tercer número:");
            int N3 = Integer.parseInt(scanner.nextLine());

            double resul = (N1 + N2 + N3) / 3;

            System.out.println("El promedio del estudiante es " + resul);
        }
    }
}
