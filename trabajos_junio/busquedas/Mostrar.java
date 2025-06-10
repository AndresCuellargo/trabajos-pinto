package busquedaPersonas;

public class Mostrar {
     public static void mostrarTodo() {
        if (Datos.cantidad == 0) {
            System.out.println("No hay personas registradas.");
            return;
        }

        System.out.println("Listado de personas:");
        for (int i = 0; i < Datos.cantidad; i++) {
            System.out.println(Datos.nombreCompleto[i] + " | " + Datos.celular[i] + " | " + Datos.email[i]);
        }
    }
}

