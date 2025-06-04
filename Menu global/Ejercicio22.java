public class Ejercicio22 {
    public static principio cl = new principio();

    public static void Ejercicio22() {
        for (int k = 1; k < 10; k++) {
            cl.a = k / 2;
            cl.b = k - (cl.a * 2);
            if (cl.b != 0) {
                System.out.println("El residuo es: " + cl.b);
            }
        }

    }
}