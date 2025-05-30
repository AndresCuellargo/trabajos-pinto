import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese el nombre del empleado:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese las horas trabajadas en el mes:");
            double horasTrabajadas = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese la tarifa por hora:");
            double tarifaPorHora = Double.parseDouble(scanner.nextLine());

            double salario = horasTrabajadas * tarifaPorHora;

            System.out.println("\n--- PLANTILLA DEL EMPLEADO ---");
            System.out.println("Nombre: " + nombre);
            System.out.println("Horas trabajadas: " + horasTrabajadas);
            System.out.println("Tarifa por hora: $" + tarifaPorHora);
            System.out.println("Salario total del mes: $" + salario);
        }
    }
}
