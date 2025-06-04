public class Ejercicio15 {
    public static principio cl = new principio();

    public static void Ejercicio15() {
        switch (cl.a) {
            case 1 -> cl.i = "A";
            case 2 -> cl.i = "B";
            case 3 -> cl.i = "C";
            case 4 -> cl.i = "D";
            case 5 -> cl.i = "E";
            default -> cl.i = "Valor incorrecto";
        }

        System.out.println("Resultado: " + cl.i);
    }
}
