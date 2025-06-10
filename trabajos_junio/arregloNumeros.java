package arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class arregloNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int x = 0; x < 10; x++) {
            System.out.println("Introduce un numero: " + (x+1));
            numeros[x] = teclado.nextInt();
        }

        Arrays.sort(numeros);
        for(int i = 0; i <10 ; i++){
            System.out.println (numeros[i]);
        }
        
       
    }
}