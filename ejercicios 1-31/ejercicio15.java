import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de ventas alcanzado:");
        double montoVentas = Double.parseDouble(scanner.nextLine());

        double bonificacion;

        if (montoVentas >= 0 && montoVentas < 1000) {
            bonificacion = (0 * montoVentas) / 100;
        } else if (montoVentas >= 1000 && montoVentas < 5000) {
            bonificacion = (3 * montoVentas) / 100;
        } else if (montoVentas >= 5000 && montoVentas < 20000) {
            bonificacion = (5 * montoVentas) / 100;
        } else {
            bonificacion = (8 * montoVentas) / 100;
        }

        System.out.println("La bonificación correspondiente es: " + bonificacion);

        scanner.close();
    }
}
