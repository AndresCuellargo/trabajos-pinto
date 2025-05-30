import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        int NV = 0; // Contador de vocales
        int NC = 0; // Contador de consonantes

        try (Scanner scanner = new Scanner(System.in)) {
            for (int K = 1; K <= 10; K++) {
                System.out.println("Ingrese una letra:");
                char L = scanner.nextLine().toLowerCase().charAt(0);

                if (L == 'a' || L == 'e' || L == 'i' || L == 'o' || L == 'u') {
                    NV++;
                } else if (Character.isLetter(L)) { // Verifica si es una consonante
                    NC++;
                }
            }

            System.out.println("Cantidad de vocales ingresadas: " + NV);
            System.out.println("Cantidad de consonantes ingresadas: " + NC);
        }
    }
}
