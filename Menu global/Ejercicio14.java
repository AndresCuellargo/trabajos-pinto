public class Ejercicio14 {
    public static principio cl = new principio();

    public static void Ejercicio14() {
        if (cl.a > 0 && cl.a <= 1000) {
            cl.resultado = cl.a * 0.03;
        } else if (cl.a > 1000 && cl.a <= 5000) {
            cl.resultado = cl.a * 0.05;
        } else if (cl.a > 5000 && cl.a <= 20000) {
            cl.resultado = cl.a * 0.08;
        } else if (cl.a > 20000) {
            cl.resultado = cl.a * 0.10;
        } else {
            cl.resultado = 0;
            System.out.println("El monto de venta debe ser mayor que 0.");
        }

        if (cl.a > 0) {
            System.out.println("La bonificación correspondiente es: " + cl.resultado);
        }
    }

}