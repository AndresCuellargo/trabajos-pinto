public class Ejercicio11 {
    public static principio cl = new principio();

    public static void Ejercicio11() {
        if (cl.a > cl.b && cl.a > cl.c) {
            System.out.println("El número mayor es: " + cl.a);
        } else if (cl.b > cl.c) {
            System.out.println("El número mayor es: " + cl.b);
        } else {
            System.out.println("El número mayor es: " + cl.c);
        }
    }
}