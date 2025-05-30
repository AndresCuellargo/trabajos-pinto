import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese el primer número:");
            int N1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el segundo número:");
            int N2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el operador (+, -, *, ^):");
            char OP = scanner.nextLine().charAt(0);

            double resultado = switch (OP) {
                case '+' -> N1 + N2;
                case '-' -> N1 - N2;
                case '*' -> N1 * N2;
                case '^' -> Math.pow(N1, N2);
                default -> {
                    System.out.println("Operador no válido.");
                    yield 0;
                }
            };

            System.out.println("El resultado es: " + resultado);
        }
    }
}
