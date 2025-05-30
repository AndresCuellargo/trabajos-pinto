import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese el primer número:");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese el segundo número:");
            double num2 = Double.parseDouble(scanner.nextLine());

            double promedio = (num1 + num2) / 2;

            System.out.println("El promedio de los dos números es: " + promedio);
        }
    }
}
