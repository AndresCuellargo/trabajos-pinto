import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese el número de respuestas correctas:");
            int correctas = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el número de respuestas incorrectas:");
            int incorrectas = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el número de respuestas en blanco:");
            int enBlanco = Integer.parseInt(scanner.nextLine());

            int puntajeFinal = (correctas * 4) + (incorrectas * -1) + (enBlanco * 0);

            System.out.println("El puntaje final del postulante es: " + puntajeFinal);
        }
    }
}
