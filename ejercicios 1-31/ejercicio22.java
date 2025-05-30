import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int primerNumero = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el segundo número:");
        int segundoNumero = Integer.parseInt(scanner.nextLine());

        int producto = 0;

        for (int k = 1; k <= segundoNumero; k++) {
            producto += primerNumero;
        }

        System.out.println("El producto mediante sumas sucesivas es: " + producto);

        scanner.close();
    }
}
