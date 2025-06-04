public class Ejercicio6 {
    public static principio cl = new principio();

    public static void Ejercicio6() {
        cl.resultado = Math.sqrt(Math.pow((cl.c - cl.a), 2) + Math.pow((cl.d - cl.b), 2));
        System.out.println("La distancia entre A y B es: " + cl.resultado);

    }
}