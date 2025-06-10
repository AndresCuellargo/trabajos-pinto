
package arreglos;

import java.util.Arrays;
import java.util.Scanner;


public class arregloCalculadora {
     public static void main(String[] args) {
        int option,pos1,pos2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int numeros[] = new int[10];

        option = teclado.nextInt();
        for (int x = 0; x < 10; x++) {
            System.out.println("Introduce un numero: " + x);
            numeros[x] = teclado.nextInt();
        }

        
        for(int y = 0; y <10 ; y++){
            System.out.println (numeros[y]);
        }

        System.out.println("Seleccione la posición del primer número (0-9):");
        pos1 = teclado.nextInt();
        System.out.println("Seleccione la posición del segundo número (0-9):");
        pos2 = teclado.nextInt();

        pos1=numeros[pos1];
        pos2=numeros[pos2];
        System.out.println("Los números seleccionados son: " + pos1 + " y " + pos2);




        
        switch (option) {
            case 1:
            {
            int suma = pos1 + pos2;
            System.out.println("La suma de " + pos1 + " y " + pos2 + " es: " + suma);
            }
                break;
            case 2:
            {
            int resta = pos1 - pos2;
            System.out.println("La resta de " + pos1 + " y " + pos2 + " es: " + resta);
            }
                break;
            case 3:
            {
            int multiplicacion = pos1 * pos2;
            System.out.println("La multiplicación de " + pos1 + " y " + pos2 + " es: " + multiplicacion);
            }
                break;
            case 4:
            {
            if (pos2 != 0) {
                double division = (double) pos1 / pos2;
                System.out.println("La división de " + pos1 + " y " + pos2 + " es: " + division);
            } else {
                System.out.println("Error: División por cero no permitida.");
            }
            }
                break;
        
            default:
            System.out.println("Operación no válida");
                break;
        }
    



        teclado.close();
}
}