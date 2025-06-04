public class Ejercicio26 {
    public static principio cl = new principio();

    public static void Ejercicio26() {
        cl.teclado.nextLine();
        System.out.print("Ingrese la operación (+, -, *, ^): ");
        cl.i = cl.teclado.nextLine();

        switch (cl.i) {
            case "+" -> cl.r = cl.a + cl.b;
            case "-" -> cl.r = cl.a - cl.b;
            case "*" -> cl.r = cl.a * cl.b;
            case "^" -> cl.r = Math.pow(cl.a, cl.b);
            default -> {
                cl.r = 0;
                System.out.println("Operación no válida.");
            }
        }
        System.out.println("La respuesta es: " + cl.r);
    }
}