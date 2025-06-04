public class Ejercicio25 {
    public static principio cl = new principio();
    public static final String nombre = "Ejercicio 25";

    public static void Ejercicio25() {
        cl.l = 0;
        cl.m = 1;
        cl.c = cl.l + cl.m;
        while (cl.c < 100000) {
            System.out.println(cl.c);
            cl.l = cl.b;
            cl.m = cl.c;
            cl.c = cl.l + cl.m;
        }
    }

}