public class Ejercicio8 {
    public static principio cl = new principio();

    public static void Ejercicio8() {
        cl.resultado = cl.a - cl.b;
        System.out.println("Su edad es: " + cl.resultado);

        if (cl.resultado > 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aún");
        }
    }
}