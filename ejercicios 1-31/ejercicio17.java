import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero de dos cifras:");
        int numero = Integer.parseInt(scanner.nextLine());

        int decenas = numero / 10; // División entera para obtener las decenas
        int unidades = numero % 10; // Residuo para obtener las unidades

        System.out.println("Decenas: " + decenas);
        System.out.println("Unidades: " + unidades);

        scanner.close();
    }
}
