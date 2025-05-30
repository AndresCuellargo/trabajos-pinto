public class ejercicio24 {
    public static void main(String[] args) {
        int S = 1; // Primer término de la serie

        while (S < 1000) {
            System.out.println(S);
            S = (S * S) + 1; // Generar el siguiente término
        }
    }
}
