import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;
        boolean esVocal = false;

        while (!esVocal) {
            System.out.println("Ingrese una letra:");
            letra = scanner.nextLine().toLowerCase().charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                esVocal = true;
            }
        }

        System.out.println("¡Ingresaste una vocal! Fin del programa.");
        scanner.close();
    }
}
