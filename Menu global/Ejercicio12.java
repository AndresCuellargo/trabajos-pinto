public class Ejercicio12 {
    public static principio cl = new principio();

    public static void Ejercicio12() {
        if (cl.a != cl.b && cl.b != cl.c && cl.a != cl.c) {
            cl.i = "Escaleno";
        } else if (cl.a == cl.b && cl.b == cl.c) {
            cl.i = "Equilátero";
        } else {
            cl.i = "Isósceles";
        }

        System.out.println("El tipo de triángulo es: " + cl.i);
    }
}