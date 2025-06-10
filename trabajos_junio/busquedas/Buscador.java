package busquedaPersonas;

import java.util.Scanner;

public class Buscador {
    public static void buscar(Scanner sc) {
        System.out.println("Buscar por cualquier dato:");
        String dato = sc.nextLine().toLowerCase();
        boolean encontrado = false;

        for (int i = 0; i < Datos.cantidad; i++) {
            if (
                Datos.nombre1[i].toLowerCase().contains(dato) ||//hace q los busq en minusaculas
                Datos.nombre2[i].toLowerCase().contains(dato) ||
                Datos.apellido1[i].toLowerCase().contains(dato) ||
                Datos.apellido2[i].toLowerCase().contains(dato) ||
                Datos.celular[i].toLowerCase().contains(dato) ||
                Datos.email[i].toLowerCase().contains(dato)
            )
            {
                System.out.println(Datos.nombreCompleto[i] + " | " + Datos.celular[i] + " | " + Datos.email[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna coincidencia.");
        }
    }
}
