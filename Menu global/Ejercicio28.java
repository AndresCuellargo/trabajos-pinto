public class Ejercicio28 {
    public static principio cl = new principio();

    public static void Ejercicio28() {
        cl.a = cl.b = cl.c = cl.d = 0;

        for (int p = 1; p <= 160; p++) {
            System.out.print("Ingrese el voto #" + p + " (1, 2, 3 para candidatos, otro para nulo/blanco): ");
            switch (cl.e) {
                case 1 -> cl.a++;
                case 2 -> cl.b++;
                case 3 -> cl.c++;
                default -> cl.d++;
            }
        }
        if (cl.a > cl.b && cl.a > cl.c) {
            cl.resultado = 1;
        } else if (cl.b > cl.a && cl.b > cl.c) {
            cl.resultado = 2;
        } else if (cl.c > cl.a && cl.c > cl.b) {
            cl.resultado = 3;
        } else {
            cl.resultado = 0;
        }

        System.out.println("El ganador es: " +
                (cl.resultado == 0 ? "Empate o Sin mayoría clara" : "Candidato " + (int) cl.resultado));
        System.out.println("Votos nulos o en blanco: " + (int) cl.d);
    }
}