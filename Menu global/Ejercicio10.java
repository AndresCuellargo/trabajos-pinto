public class Ejercicio10 {
    public static principio cl = new principio();

    public static void Ejercicio10() {
        cl.j = (cl.a + cl.b + cl.c + cl.d + cl.e + cl.f);
        cl.resultado = cl.j / 6;

        if (cl.resultado >= 100) {
            System.out.println("Recibirá incentivos");
        } else {
            System.out.println("No recibirá incentivos");
        }
    }
}