public class ingresarDatos {

    public static principio cl = new principio();

    public static void teclado1() {
        System.out.println("Ingrese el valor:");
        cl.a = cl.teclado.nextInt();
    }

    public static void teclado2() {
        System.out.println("Ingrese el primer valor:");
        cl.a = cl.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        cl.b = cl.teclado.nextInt();
    }

    public static void teclado3() {
        System.out.println("Ingrese el primer valor:");
        cl.a = cl.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        cl.b = cl.teclado.nextInt();
        System.out.println("Ingrese el tercer valor:");
        cl.c = cl.teclado.nextInt();
    }

    public static void teclado4() {
        System.out.println("Ingrese el primer valor:");
        cl.a = cl.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        cl.b = cl.teclado.nextInt();
        System.out.println("Ingrese el tercer valor:");
        cl.c = cl.teclado.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        cl.d = cl.teclado.nextInt();
    }

    public static void teclado6() {
        System.out.println("Ingrese el primer valor:");
        cl.a = cl.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        cl.b = cl.teclado.nextInt();
        System.out.println("Ingrese el tercer valor:");
        cl.c = cl.teclado.nextInt();
        System.out.println("Ingrese el segundo valor:");
        cl.d = cl.teclado.nextInt();
        System.out.println("Ingrese el cuarto valor:");
        cl.e = cl.teclado.nextInt();
        System.out.println("Ingrese el quinto valor:");
        cl.f = cl.teclado.nextInt();
    }

    public static void teclado7() {
        System.out.println("Ingrese el valor:");
        cl.resultado = cl.teclado.nextDouble();
    }

    public static void teclado10() {
        System.out.println("Ingrese el valor:");
        cl.letra = cl.teclado.next().charAt(0);
    }

}