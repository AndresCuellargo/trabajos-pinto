import java.util.Scanner;

public class ejercicio31 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese un número del 1 al 12:");
            int numero = Integer.parseInt(scanner.nextLine());

            String mes = switch (numero) {
                case 1 -> "Enero";
                case 2 -> "Febrero";
                case 3 -> "Marzo";
                case 4 -> "Abril";
                case 5 -> "Mayo";
                case 6 -> "Junio";
                case 7 -> "Julio";
                case 8 -> "Agosto";
                case 9 -> "Septiembre";
                case 10 -> "Octubre";
                case 11 -> "Noviembre";
                case 12 -> "Diciembre";
                default -> "Número fuera de rango";
            };

            System.out.println("El mes correspondiente es: " + mes);
        }
    }
}
