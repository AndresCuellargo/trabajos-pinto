import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada X del punto A:");
        double xA = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese la coordenada Y del punto A:");
        double yA = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese la coordenada X del punto B:");
        double xB = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese la coordenada Y del punto B:");
        double yB = Double.parseDouble(scanner.nextLine());

        double distancia = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));

        System.out.println("La distancia entre los puntos A y B es: " + distancia);

        scanner.close();
    }
}
