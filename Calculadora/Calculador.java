import java.util.Scanner;

public class Calculador {
    public static double a, b, res;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int op;

        do {
            System.out.println("Seleccione la opción:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. División");
            System.out.println("4. Multiplicación");
            System.out.println("5. Salir");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    division();
                    break;
                case 4:
                    multiplicacion();
                    break;
                default:
                    break;
            }
        } while (op < 5);
    }

    public static void suma() {
        Scan();
        res = 0;
        res = a + b;
        System.out.println("Resultado: " + res);
    }

    public static void resta() {
        Scan();
        res = 0;
        res = a - b;
        System.out.println("Resultado: " + res);
    }

    public static void division() {
        Scan();
        if (b != 0 || a != 0) {
            res = 0;
            res = a / b;
            System.out.println("Resultado: " + res);
            System.out.println();
        } else {
            System.out.println("Error: División por cero no permitida.");
        }

    }

    public static void multiplicacion() {
        Scan();
        res = 0;
        res = a * b;
        System.out.println("Resultado: " + res);
    }

    public static void Scan() {
        System.out.println("ingresa el numero que deseas operar");
        a = teclado.nextDouble();
        System.out.println("ingresa el operador");
        b = teclado.nextDouble();
    }
}
