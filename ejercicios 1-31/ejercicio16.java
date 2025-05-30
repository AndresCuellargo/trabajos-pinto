import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 5:");
        int numero = Integer.parseInt(scanner.nextLine());

        String vocal;

        switch (numero) {
            case 1:
                vocal = "A";
                break;
            case 2:
                vocal = "E";
                break;
            case 3:
                vocal = "I";
                break;
            case 4:
                vocal = "O";
                break;
            case 5:
                vocal = "U";
                break;
            default:
                vocal = "Valor Incorrecto";
                break;
        }

        System.out.println("La vocal correspondiente es: " + vocal);

        scanner.close();
    }
}
