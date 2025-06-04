import java.util.Scanner;

public class principio {

    public static principio cl = new principio();

    public static int a, b, c, d, e, f;
    public static double j, r, resultado;
    public static int l = 0, m = 0, nv = 0, nc = 0;
    public static String i, n;
    public static char letra;

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Digite un número del 1 al 30:");
            System.out.println("Digite 31 para salir");
            System.out.print("Opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Has seleccionado la opción 1");
                    ingresarDatos.teclado2();
                    Ejercicio1.Ejercicio1();

                    break;
                }
                case 2: {
                    System.out.println("Has seleccionado la opción 2");
                    ingresarDatos.teclado3();
                    Ejercicio2.Ejercicio2();
                    break;
                }
                case 3: {
                    System.out.println("Has seleccionado la opción 3");
                    ingresarDatos.teclado2();
                    Ejercicio3.Ejercicio3();
                    break;
                }
                case 4: {
                    System.out.println("Has seleccionado la opción 4");
                    ingresarDatos.teclado2();
                    Ejercicio4.Ejercicio4();
                    break;
                }
                case 5: {
                    System.out.println("Has seleccionado la opción 5");
                    ingresarDatos.teclado2();
                    Ejercicio5.Ejercicio5();
                    break;
                }
                case 6: {
                    System.out.println("Has seleccionado la opción 6");
                    ingresarDatos.teclado4();
                    Ejercicio6.Ejercicio6();
                    break;
                }
                case 7: {
                    System.out.println("Has seleccionado la opción 7");
                    ingresarDatos.teclado7();
                    Ejercicio7.Ejercicio7();
                    break;
                }
                case 8: {
                    System.out.println("Has seleccionado la opción 8");
                    ingresarDatos.teclado2();
                    Ejercicio8.Ejercicio8();
                    break;
                }
                case 9: {
                    System.out.println("Has seleccionado la opción 9");
                    ingresarDatos.teclado2();
                    Ejercicio9.Ejercicio9();
                    break;
                }
                case 10: {
                    System.out.println("Has seleccionado la opción 10");
                    ingresarDatos.teclado6();
                    Ejercicio10.Ejercicio10();
                    break;
                }
                case 11: {
                    System.out.println("Has seleccionado la opción 11");
                    ingresarDatos.teclado3();
                    Ejercicio11.Ejercicio11();
                    break;
                }
                case 12: {
                    System.out.println("Has seleccionado la opción 12");
                    ingresarDatos.teclado3();
                    Ejercicio12.Ejercicio12();
                    break;
                }
                case 13: {
                    System.out.println("Has seleccionado la opción 13");
                    ingresarDatos.teclado1();
                    Ejercicio13.Ejercicio13();
                    break;
                }
                case 14: {
                    System.out.println("Has seleccionado la opción 14");
                    ingresarDatos.teclado1();
                    Ejercicio14.Ejercicio14();
                    break;
                }
                case 15: {
                    System.out.println("Has seleccionado la opción 15");
                    ingresarDatos.teclado1();
                    Ejercicio15.Ejercicio15();
                    break;
                }
                case 16: {
                    System.out.println("Has seleccionado la opción 16");
                    ingresarDatos.teclado1();
                    Ejercicio16.Ejercicio16();
                    break;
                }
                case 17: {
                    System.out.println("Has seleccionado la opción 17");
                    ingresarDatos.teclado1();
                    Ejercicio17.Ejercicio17();
                    break;
                }
                case 18: {
                    System.out.println("Has seleccionado la opción 18");
                    ingresarDatos.teclado1();
                    Ejercicio18.Ejercicio18();
                    break;
                }
                case 19: {
                    System.out.println("Has seleccionado la opción 19");
                    ingresarDatos.teclado1();
                    Ejercicio19.Ejercicio19();
                    break;
                }
                case 20: {
                    System.out.println("Has seleccionado la opción 20");
                    ingresarDatos.teclado1();
                    Ejercicio20.Ejercicio20();
                    break;
                }
                case 21: {
                    System.out.println("Has seleccionado la opción 21");
                    ingresarDatos.teclado2();
                    Ejercicio21.Ejercicio21();
                    break;
                }
                case 22: {
                    System.out.println("Has seleccionado la opción 22");
                    ingresarDatos.teclado2();
                    Ejercicio22.Ejercicio22();
                    break;
                }
                case 23: {
                    System.out.println("Has seleccionado la opción 23");
                    ingresarDatos.teclado7();
                    Ejercicio23.Ejercicio23();
                    break;
                }
                case 24: {
                    System.out.println("Has seleccionado la opción 24");
                    ingresarDatos.teclado10();
                    Ejercicio24.Ejercicio24();
                    break;
                }
                case 25: {
                    System.out.println("Has seleccionado la opción 25");
                    ingresarDatos.teclado2();
                    Ejercicio25.Ejercicio25();
                    break;
                }
                case 26: {
                    System.out.println("Has seleccionado la opción 26");
                    ingresarDatos.teclado10();
                    Ejercicio26.Ejercicio26();
                    break;
                }
                case 27: {
                    System.out.println("Has seleccionado la opción 27");
                    ingresarDatos.teclado10();
                    Ejercicio27.Ejercicio27();
                    break;
                }
                case 28: {
                    System.out.println("Has seleccionado la opción 28");
                    ingresarDatos.teclado1();
                    Ejercicio28.Ejercicio28();
                    break;
                }
                case 29: {
                    System.out.println("Has seleccionado la opción 29");
                    ingresarDatos.teclado2();
                    Ejercicio29.Ejercicio29();
                    break;
                }
                case 30: {
                    System.out.println("Has seleccionado la opción 30");
                    ingresarDatos.teclado1();
                    Ejercicio30.Ejercicio30();
                    break;
                }

                case 31: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Opción inválida.");
                    break;
                }
            }

        } while (opcion != 31);

        teclado.close();
    }
}
