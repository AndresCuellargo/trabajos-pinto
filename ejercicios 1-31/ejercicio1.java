import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese tiempo (sg):");
            int tiempo = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese velocidad constante (m/s):");
            int velocidad = Integer.parseInt(scanner.nextLine());

            int distancia = tiempo * velocidad;

            System.out.println("La distancia recorrida es " + distancia + " metros.");
        }
    }

}
