public class Ejercicio20 {
    public static principio cl = new principio();

    public static void Ejercicio20() {
        cl.l = 0;
        cl.m = 0;
        for (int k = 1; k <= 200; k++) {
            System.out.println("Ingrese la edad:");
            if (cl.a < 18) {
                cl.l++;
            } else {
                cl.m++;
            }
        }
        System.out.println("Los menores son: " + cl.l);
        System.out.println("Los mayores son: " + cl.m);
    }
}
