public class Ejercicio9 {
    public static principio cl = new principio();

    public static void Ejercicio9() {

        if (cl.a > cl.b) {
            System.out.println("La primera edad (" + cl.a + ") es mayor que la segunda (" + cl.b + ").");
        } else if (cl.b > cl.a) {
            System.out.println("La segunda edad (" + cl.b + ") es mayor que la primera (" + cl.a + ").");
        } else {
            System.out.println("Ambas edades son iguales.");
        }
    }
}