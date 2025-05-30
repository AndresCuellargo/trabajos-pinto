import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese su año de nacimiento:");
            int anioNacimiento = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el año actual:");
            int anioActual = Integer.parseInt(scanner.nextLine());

            int edad = anioActual - anioNacimiento;

            if (edad > 17) {
                System.out.println("Debe solicitar su CUIL.");
            } else {
                System.out.println("No debe solicitar su CUIL aún.");
            }

        }
    }
}