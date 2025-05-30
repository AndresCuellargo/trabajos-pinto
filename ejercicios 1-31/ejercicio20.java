import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de empleados:");
        int numEmpleados = Integer.parseInt(scanner.nextLine());

        double sumaSueldos = 0;

        for (int k = 1; k <= numEmpleados; k++) {
            System.out.println("Ingrese el sueldo del empleado " + k + ":");
            double sueldo = Double.parseDouble(scanner.nextLine());
            sumaSueldos += sueldo;
        }

        double sueldoPromedio = sumaSueldos / numEmpleados;

        System.out.println("El sueldo promedio es: " + sueldoPromedio);

        scanner.close();
    }
}
