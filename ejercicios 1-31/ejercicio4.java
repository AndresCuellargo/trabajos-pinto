import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese el número de partidos ganados:");
            int ganados = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el número de partidos empatados:");
            int empatados = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el número de partidos perdidos:");
            int perdidos = Integer.parseInt(scanner.nextLine());

            int puntajeTotal = (ganados * 3) + (empatados * 1) + (perdidos * 0);

            System.out.println("El puntaje total del equipo es: " + puntajeTotal + " puntos.");
        }
    }
}
