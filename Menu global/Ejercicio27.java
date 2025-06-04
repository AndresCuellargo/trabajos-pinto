public class Ejercicio27 {
    public static principio cl = new principio();

    public static void Ejercicio27() {
        for (int K = 1; K <= 10; K++) {
            if (Character.isLetter(cl.letra)) {
                switch (cl.letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        cl.a++;
                        break;
                    default:
                        cl.b++;
                        break;
                }
            } else {
                System.out.println("Carácter no válido Intente de nuevo.");
            }
        }
        System.out.println("Número de vocales: " + cl.a);
        System.out.println("Número de consonantes: " + cl.b);
    }
}