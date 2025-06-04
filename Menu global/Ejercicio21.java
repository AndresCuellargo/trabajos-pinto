public class Ejercicio21 {
    public static principio cl = new principio();

    public static void Ejercicio21() {
        cl.l = 0;
        for (int k = 1; k <= cl.b; k++) {
            cl.l += cl.a;
        }
        System.out.println("El producto es: " + cl.l);
    }
}
