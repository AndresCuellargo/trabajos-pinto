public class Ejercicio13 {
    public static principio cl = new principio();

    public static void Ejercicio13() {
        switch (cl.a) {
            case 1 -> cl.i = "I";
            case 2 -> cl.i = "II";
            case 3 -> cl.i = "III";
            case 4 -> cl.i = "IV";
            case 5 -> cl.i = "V";
            case 6 -> cl.i = "VI";
            case 7 -> cl.i = "VII";
            case 8 -> cl.i = "VIII";
            case 9 -> cl.i = "IX";
            case 10 -> cl.i = "X";
            default -> cl.i = "Número fuera de rango (1-10)";
        }

        System.out.println("Equivalente en romano: " + cl.i);
    }
}
