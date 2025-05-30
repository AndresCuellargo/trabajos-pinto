import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese el lado A:");
            double A = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese el lado B:");
            double B = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese el lado C:");
            double C = Double.parseDouble(scanner.nextLine());

            if (A + B > C && A + C > B && B + C > A) {

                double S = (A + B + C) / 2;

                double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

                System.out.println("El semiperímetro es: " + S);
                System.out.println("El área del triángulo es: " + area);
            } else {
                System.out.println("Los lados ingresados no forman un triángulo válido.");
            }
        }
    }
}
