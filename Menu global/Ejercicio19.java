public class Ejercicio19 {
    public static principio cl = new principio();

    public static void Ejercicio19() {
        cl.l = 0;

        for (int k = 1; k <= cl.a; k++) {
            System.out.print("Ingrese el sueldo del empleado " + k + ": ");
            cl.b = cl.teclado.nextInt();
            cl.l += cl.b;
        }

        cl.j = (double) cl.l / cl.a;
        System.out.println("El sueldo promedio es: " + cl.j);
    }
}
