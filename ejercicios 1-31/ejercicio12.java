import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el segundo número:");
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el tercer número:");
        int n3 = Integer.parseInt(scanner.nextLine());

        int mayor;

        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else if (n2 > n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }

        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
