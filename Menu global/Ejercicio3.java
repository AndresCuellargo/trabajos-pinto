
public class Ejercicio3 {
    public static principio cl = new principio();

    public static void Ejercicio3() {
        cl.c = cl.a * 4;
        cl.d = cl.b * -1;
        cl.resultado = cl.c + cl.d;
        if (cl.resultado < 0) {
            System.out.println("La nota es 0" + cl.resultado);
        }
        System.out.println("el puntaje final es: " + cl.resultado);
    }
}