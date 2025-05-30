import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayores = 0;
        int menores = 0;

        for (int k = 1; k <= 200; k++) {
            System.out.println("Ingrese la edad de la persona " + k + ":");
            int edad = Integer.parseInt(scanner.nextLine());

            if (edad < 18) {
                menores++;
            } else {
                mayores++;
            }
        }

        System.out.println("Cantidad de personas mayores de edad: " + mayores);
        System.out.println("Cantidad de personas menores de edad: " + menores);

        scanner.close();
    }
}
