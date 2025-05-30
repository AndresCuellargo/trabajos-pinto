import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la capacidad del disco en GB:");
        int capacidadGB = Integer.parseInt(scanner.nextLine());

        int capacidadMB = capacidadGB * 1024;
        int capacidadCD = 700;

        // Calculamos el número de CDs necesarios, redondeando hacia arriba
        int cantidadCDs = (int) Math.ceil((double) capacidadMB / capacidadCD);

        System.out.println("Cantidad de CDs necesarios: " + cantidadCDs);

        scanner.close();
    }
}
