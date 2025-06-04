public class Ejercicio16 {
    public static principio cl = new principio();

    public static void Ejercicio16() {
        if (cl.a >= 10 && cl.a <= 99) {
            cl.b = cl.a / 10;
            cl.c = cl.a - (cl.b * 10);
            cl.d = cl.b;
            cl.e = cl.c;
            System.out.println("Decenas: " + cl.d);
            System.out.println("Unidades: " + cl.e);
        } else {
            System.out.println("El número ingresado no es de dos cifras.");
        }
    }
}