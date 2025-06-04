public class Ejercicio17 {
    public static principio cl = new principio();

    public static void Ejercicio17() {
        cl.b = cl.a / 2;
        cl.c = cl.a - (cl.b * 2);

        if (cl.c == 0) {
            cl.i = "Es Par";
        } else {
            cl.i = "Es Impar";
        }
        System.out.println(cl.i);
    }

}