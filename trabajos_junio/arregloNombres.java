package arreglos;

import java.util.Arrays;
///import java.util.Collections;
import java.util.Scanner;

public class arregloNombres {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres= new String[10];

        for (int x = 0; x < 10; x++) {
            System.out.println("Introduce un nombre: " + (x+1));
            nombres[x] = teclado.nextLine();
        }
        System.out.println("----------------------------");

        Arrays.sort(nombres);
        ///Arrays.sort(nombres, Collections.reverseOrder());
        for(int i = 0; i <10 ; i++){
            System.out.println (nombres[i]);
        }
        
       
    }
}
