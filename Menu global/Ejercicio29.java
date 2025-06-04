public class Ejercicio29 {
    public static principio cl = new principio();

    public static void Ejercicio29() {
        cl.c = cl.a + cl.b;
        cl.resultado = cl.c / 2;

        System.out.println("El promedio de ambos números es: " + cl.resultado);
    }
}