import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de producción diaria
        System.out.println("Ingrese la producción del lunes:");
        int lunes = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la producción del martes:");
        int martes = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la producción del miércoles:");
        int miercoles = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la producción del jueves:");
        int jueves = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la producción del viernes:");
        int viernes = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la producción del sábado:");
        int sabado = Integer.parseInt(scanner.nextLine());

        // Cálculo del promedio
        int totalProduccion = lunes + martes + miercoles + jueves + viernes + sabado;
        double promedio = totalProduccion / 6.0;

        // Determinar si recibe incentivo
        if (promedio >= 100) {
            System.out.println("Recibirá incentivos.");
        } else {
            System.out.println("No recibirá incentivos.");
        }

        scanner.close();
    }
}
