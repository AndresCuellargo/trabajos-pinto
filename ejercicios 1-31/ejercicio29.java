import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int C1 = 0, C2 = 0, C3 = 0, C0 = 0;

            for (int K = 1; K <= 160; K++) {
                System.out.println(
                        "Ingrese el voto del elector " + K
                                + " (1, 2, 3 para candidatos, otro número para nulo/blanco):");
                int VE = Integer.parseInt(scanner.nextLine());

                switch (VE) {
                    case 1 -> C1++;
                    case 2 -> C2++;
                    case 3 -> C3++;
                    default -> C0++;
                }
            }

            int ganador;
            if (C1 > C2 && C1 > C3 && C1 > C0) {
                ganador = 1;
            } else if (C2 > C3 && C2 > C0) {
                ganador = 2;
            } else if (C3 > C0) {
                ganador = 3;
            } else {
                ganador = 0; // Elección sin mayoría clara
            }

            System.out.println("El ganador es el candidato: " + (ganador == 0 ? "Nulo/Blanco" : ganador));
        }
    }
}
