public class Ejercicio7 {
    public static principio cl = new principio();

    public static void Ejercicio7() {
        cl.j = cl.r * 1.024;
        cl.resultado = (int) ((cl.r / 700) + 1);

        System.out.println("los CDs son : " + cl.resultado);

    }

}