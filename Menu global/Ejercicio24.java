public class Ejercicio24 {
    public static principio cl = new principio();

    public static void Ejercicio24() {
        switch (cl.i) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                cl.n = "R";
                break;
            default:
                cl.n = "V";
                break;
        }
    }
}