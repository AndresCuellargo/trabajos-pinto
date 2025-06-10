package busquedaPersonas;

import java.util.Scanner;

public class Persona {
     public static void agregarPersona(Scanner sc) {
        if (Datos.cantidad >= 10) {
            System.out.println("Límite de personas alcanzado.");
            return;
        }

        System.out.println("Nombre 1:");
        Datos.nombre1[Datos.cantidad] = sc.nextLine();

        System.out.println("Nombre 2:");
        Datos.nombre2[Datos.cantidad] = sc.nextLine();

        System.out.println("Apellido 1:");
        Datos.apellido1[Datos.cantidad] = sc.nextLine();

        System.out.println("Apellido 2:");
        Datos.apellido2[Datos.cantidad] = sc.nextLine();

        String cel;
        do {
            System.out.println("Celular:");
            cel = sc.nextLine();
        } while (Validador.celularExiste(cel));
        Datos.celular[Datos.cantidad] = cel;

        String mail;
        do {
            System.out.println("Email:");
            mail = sc.nextLine();
        } while (Validador.emailExiste(mail));
        Datos.email[Datos.cantidad] = mail;

        // Armar nombre completo
        Datos.nombreCompleto[Datos.cantidad] = Datos.nombre1[Datos.cantidad] + " " +
                                               Datos.nombre2[Datos.cantidad] + " " +
                                               Datos.apellido1[Datos.cantidad] + " " +
                                               Datos.apellido2[Datos.cantidad];

        Datos.cantidad++;
        System.out.println("Persona registrada correctamente.");
    }
}
