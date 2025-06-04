public class Ejercicio23 {
    public static principio cl = new principio();

    public static void Ejercicio23() {
        while (cl.l < 1000) {
            System.out.println(cl.l);
            cl.l = cl.l * cl.l + 1;
        }
    }
}