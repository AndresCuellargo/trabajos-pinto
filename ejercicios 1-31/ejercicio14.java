import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Ingrese un número entre 1 y 10:");
            int numero = Integer.parseInt(scanner.nextLine());

            String romano = switch (numero) {
                case 1 -> "I";
                case 2 -> "II";
                case 3 -> "III";
                case 4 -> "IV";
                case 5 -> "V";
                case 6 -> "VI";
                case 7 -> "VII";
                case 8 -> "VIII";
                case 9 -> "IX";
                case 10 -> "X";
                default -> "Número fuera de rango";
            };

            System.out.println("El equivalente en números romanos es: " + romano);
        }
    }
}
