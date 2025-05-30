import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer lado:");
        int L1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el segundo lado:");
        int L2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el tercer lado:");
        int L3 = Integer.parseInt(scanner.nextLine());

        String tipoTriangulo;

        if (L1 != L2 && L2 != L3 && L3 != L1) {
            tipoTriangulo = "Escaleno";
        } else if (L1 == L2 && L2 == L3) {
            tipoTriangulo = "Equilátero";
        } else {
            tipoTriangulo = "Isósceles";
        }

        System.out.println("El tipo de triángulo es: " + tipoTriangulo);

        scanner.close();
    }
}