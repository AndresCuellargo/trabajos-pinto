import java.util.Scanner;

public class MenuEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int a, b, c, d, e, f, g, h, i;
        double ad, bd, cd, dd, ed;
        char ac, bc;
        System.out.println("Elige un ejercicio:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Ejercicio 11");
        System.out.println("12. Ejercicio 12");
        System.out.println("13. Ejercicio 13");
        System.out.println("14. Ejercicio 14");
        System.out.println("15. Ejercicio 15");
        System.out.println("16. Ejercicio 16");
        System.out.println("17. Ejercicio 17");
        System.out.println("18. Ejercicio 18");
        System.out.println("19. Ejercicio 19");
        System.out.println("20. Ejercicio 20");
        System.out.println("21. Ejercicio 21");
        System.out.println("22. Ejercicio 22");
        System.out.println("23. Ejercicio 23");
        System.out.println("24. Ejercicio 24");
        System.out.println("25. Ejercicio 25");
        System.out.println("26. Ejercicio 26");
        System.out.println("27. Ejercicio 27");
        System.out.println("28. Ejercicio 28");
        System.out.println("29. Ejercicio 29");
        System.out.println("30. Ejercicio 30");
        System.out.println("31. Ejercicio 31\nque ejercicio desea ejecutar");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa tiempo: ");
                a = scanner.nextInt();
                System.out.print("Ingresa velocidad: ");
                b = scanner.nextInt();
                c = a * b;
                System.out.println("distance is: " + c);
                break;
            case 2:
                System.out.print("Ingresa nota 1: ");
                a = scanner.nextInt();
                System.out.print("Ingresa nota 2: ");
                b = scanner.nextInt();
                System.out.print("Ingresa nota 3: ");
                c = scanner.nextInt();
                d = a + b + c / 3;
                System.out.print("el promedio es: " + d);
                break;
            case 3:
                System.out.print("ingresa numero de respuestas correctas: ");
                a = scanner.nextInt();
                System.out.print("ingresa numero de respuestas incorrectas: ");
                b = scanner.nextInt();
                System.out.print("ingresa numero de respuestas en blanco: ");
                c = scanner.nextInt();
                d = a * 4;
                e = b * -1;
                f = d + e;
                System.out.println("el puntaje final es: " + f);
                break;
            case 4:
                a = 3;
                b = 1;
                c = 0;
                System.out.print("Ingresa cuantos equipos son: ");
                d = scanner.nextInt();
                for (e = 1; e <= d; e++) {
                    System.out.println("Ingresa datos de equipo: " + e);
                    System.out.print(" Ingresa partidos ganados: ");
                    f = scanner.nextInt() * a;
                    System.out.print("Ingresa partidos empatados: ");
                    g = scanner.nextInt() * b;
                    System.out.print("Ingresa partidos perdidos: ");
                    h = scanner.nextInt() * c;
                    i = f + g + h;
                    System.out.println("puntaje total de equipo: " + e + " es: " + i);
                }

                break;
            case 5:
                System.out.print("Ingresa tarifa por hora: ");
                a = scanner.nextInt();
                System.out.print("Ingresa tiempo laburado en horas: ");
                b = scanner.nextInt();
                c = a * b;
                System.out.println("total pagar: " + c);
                break;
            case 6:
                System.out.print("Ingresa lado a: ");
                ad = scanner.nextDouble();
                System.out.print("Ingresa lado b: ");
                bd = scanner.nextDouble();
                System.out.print("Ingresa lado c: ");
                cd = scanner.nextDouble();
                dd = (ad + bd + cd) / 2;
                ed = Math.sqrt(dd * (dd - ad) * (dd - bd) * (dd - cd));
                System.out.println("area es: " + ed);
                break;
            case 7:
                System.out.print("Ingresa GB del disco: ");
                a = scanner.nextInt();
                b = a * 1024;
                c = (b / 700) + 1;
                System.out.println("Para hacer la copia de seguridad se necesitan " + c + " CD");
                break;
            case 8:
                System.out.print("Ingresa abcisa de a: ");
                a = scanner.nextInt();
                System.out.print("Ingresa abcisa de b: ");
                b = scanner.nextInt();
                System.out.print("Ingresa ordenada a: ");
                c = scanner.nextInt();
                System.out.print("Ingresa ordenada b: ");
                d = scanner.nextInt();
                ad = Math.sqrt(Math.pow((b - a), 2) + Math.pow((d - c), 2));
                System.out.println("distancia es: " + ad);
                break;
            case 9:
                System.out.print("Ingresa año de nacimiento: ");
                a = scanner.nextInt();
                System.out.print("Ingresa año actual: ");
                b = scanner.nextInt();
                c = b - a;
                if (c > 17) {
                    System.out.println("Debe solicitar su CUIL");
                } else if (c < 17) {
                    System.out.println("No debe solicitar su CUIL");
                } else {
                    System.out.println("Debe solicitar su CUIL");
                }
                break;
            case 10:
                System.out.print("Ingresa edad del hermano 1: ");
                a = scanner.nextInt();
                System.out.print("Ingresa edad del hermano 2: ");
                b = scanner.nextInt();
                if (a > b) {
                    c = a - b;
                    System.out.println("El hermano 1 es mayor por " + c + " años");
                } else if (a < b) {
                    c = b - a;
                    System.out.println("El hermano 2 es mayor por " + c + " años");
                } else {
                    System.out.println("Ambos hermanos tienen la misma edad");
                }
                break;
            case 11:
                System.out.print("Ingresa producción del día lunes: ");
                a = scanner.nextInt();
                System.out.print("Ingresa producción del día martes: ");
                b = scanner.nextInt();
                System.out.print("Ingresa producción del día miércoles: ");
                c = scanner.nextInt();
                System.out.print("Ingresa producción del día jueves: ");
                d = scanner.nextInt();
                System.out.print("Ingresa producción del día viernes: ");
                e = scanner.nextInt();
                System.out.print("Ingresa producción del día sábado: ");
                f = scanner.nextInt();
                g = a + b + c + d + e + f;
                h = g / 6;
                if (h >= 100) {
                    System.out.println("Recibirá incentivos");
                } else {
                    System.out.println("No recibirá incentivos");
                }
                break;
            case 12:
                System.out.print("Ingresa number One: ");
                a = scanner.nextInt();
                System.out.print("Ingresa number Two: ");
                b = scanner.nextInt();
                System.out.print("Ingresa number Three: ");
                c = scanner.nextInt();
                if (a > b && a > c) {
                    System.out.println("El mayor es: " + a);
                } else if (b > a && b > c) {
                    System.out.println("El mayor es: " + b);
                } else if (c > a && c > b) {
                    System.out.println("El mayor es: " + c);
                } else if (a == b && a > c) {
                    System.out.println("Number One y Number Two son iguales y son mayores que el tercero");
                } else if (a == c && a > b) {
                    System.out.println("Number One y Number Three son iguales y son mayores que el segundo");
                } else if (b == c && b > a) {
                    System.out.println("Number Two y Number Three son iguales y son mayores que el primero");
                } else {
                    System.out.println("Los tres números son iguales: " + a);
                }
                break;
            case 13:
                System.out.print("Ingresa lado 1: ");
                ad = scanner.nextDouble();
                System.out.print("Ingresa lado 2: ");
                bd = scanner.nextDouble();
                System.out.print("Ingresa lado 3: ");
                cd = scanner.nextDouble();

                if (ad != bd && ad != cd && cd != ad) {
                    System.out.println("Es un triángulo escaleno");
                } else if (ad == bd && ad == cd) {
                    System.out.println("Es un triángulo equilátero");
                } else {
                    System.out.println("Es un triángulo isósceles");
                }
                break;
            case 14:
                System.out.print("Ingresa un número del uno al 10: ");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("I");
                        break;
                    case 2:
                        System.out.println("II");
                        break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                    default:
                        System.out.println("Número no válido, ingrese un número entre 1 y 10.");
                }
                break;
            case 15:
                System.out.print("Ingresa el monto de venta: ");
                a = scanner.nextInt();

                if (a >= 0 && a <= 1000) {
                    b = a * 0 / 100;
                    System.out.println("El total a pagar es: " + b);
                } else if (a > 1000 && a <= 5000) {
                    b = a * 3 / 100;
                    System.out.println("El total a pagar es: " + b);
                } else if (a > 5000 && a <= 20000) {
                    b = a * 5 / 100;
                    System.out.println("El total a pagar es: " + b);
                } else if (a > 20000) {
                    b = a * 8 / 100;
                    System.out.println("El total a pagar es: " + b);
                } else {
                    System.out.println("Monto no válido");
                }
            case 16:
                System.out.print("Ingresa un número del 1 al 5: ");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("a");
                        break;
                    case 2:
                        System.out.println("e");
                        break;
                    case 3:
                        System.out.println("i");
                        break;
                    case 4:
                        System.out.println("o");
                        break;
                    case 5:
                        System.out.println("u");
                        break;
                    default:
                        System.out.println("El dato ingresado no es válido para este programa");
                        break;
                }
                break;
            case 17:
                System.out.print("Ingresa un número entero de 2 cifras: ");
                a = scanner.nextInt();
                b = a / 10;
                c = a % 10;
                System.out.println("Decenas: " + b);
                System.out.println("Unidades: " + c);
                break;
            case 18:
                System.out.print("Ingresa un número entero: ");
                a = scanner.nextInt();
                if (a == 0) {
                    System.out.println("El número es cero");
                } else if (a % 2 == 0) {
                    System.out.println("El número es par");
                } else {
                    System.out.println("El número es impar");
                }
                break;
            case 19:
                for (a = 2; a <= 10; a += 2) {
                    System.out.print(a + " es un número par\n");
                }
                break;
            case 20:
                a = 0;
                System.out.print("Ingresa el número de empleados: ");
                b = scanner.nextInt();

                for (c = 1; c <= b; c++) {
                    System.out.print("Ingresa el sueldo del empleado " + c + ": ");
                    d = scanner.nextInt();
                    a += d;
                }

                System.out.println("La cantidad total a pagar es de: " + a);
                ad = (double) a / b;
                System.out.println("El sueldo promedio es: " + ad);
                break;
            case 21:
                a = 0;
                b = 0;
                System.out.print("Ingresa un número de personas a las cuales les desea calcular la edad: ");
                c = scanner.nextInt();
                for (d = 0; d < c; d++) {
                    System.out.print("Ingresa la edad de la persona: ");
                    e = scanner.nextInt();
                    if (e <= 18) {
                        b += 1;
                    } else {
                        a += 1;
                    }
                    System.out.println("Los mayores de edad son: " + a + " y los menores son: " + b);
                }
                break;
            case 22:
                a = 0;
                System.out.print("Ingresa primer número: ");
                b = scanner.nextInt();
                System.out.print("Ingresa segundo número: ");
                c = scanner.nextInt();
                for (d = 0; d <= c; d++) {
                    a = a + b;
                }
                System.out.println("El resultado es: " + a);
                break;
            case 23:
                for (a = 2; a <= 10; a++) {
                    b = a % 2;
                    if (b != 0) {
                        System.out.println(a + " es un número impar");
                    }
                }
                break;
            case 24:
                ad = 1;
                while (ad < 1000) {
                    System.out.println((int) ad);
                    ad = Math.pow(ad, 2) + 1;
                }
                break;
            case 25:
                ac = 'V';
                while (ac == 'V') {
                    System.out.print("Ingresa caracter: ");
                    bc = scanner.next().charAt(0);

                    switch (Character.toLowerCase(bc)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            ac = 'R';
                            break;
                        default:
                            ac = 'V';
                    }
                }
                break;
            case 26:
                a = 0;
                b = 1;
                c = a + b;
                System.out.println(a);
                System.out.println(b);
                while (c < 1000000) {
                    System.out.println(c);
                    a = b;
                    b = c;
                    c = a + b;
                }
                break;
            case 27:
                a = scanner.nextInt();
                b = scanner.nextInt();
                ad = 0; // Ahora ad sigue el esquema correcto para double
                System.out.print("Ingresa operador: ");
                ac = scanner.next().charAt(0);
                System.out.print("Ingresa número 1: ");
                a = scanner.nextInt();
                System.out.print("Ingresa número 2: ");
                b = scanner.nextInt();

                switch (ac) {
                    case '+':
                        ad = a + b;
                        break;
                    case '-':
                        ad = a - b;
                        break;
                    case '*':
                        ad = a * b;
                        break;
                    case '^':
                        ad = Math.pow(a, b);
                        break;
                    default:
                        ad = 0;
                        break;
                }

                System.out.print("El resultado es: ");
                System.out.print((int) ad);

            case 28:
                a = 0;
                b = 0;
                for (c = 1; c <= 10; c++) {
                    System.out.print("Ingresa caracter número: " + c + ": ");
                    ac = scanner.next().charAt(0);
                    switch (Character.toLowerCase(ac)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            a += 1;
                            break;
                        default:
                            b += 1;
                            break;
                    }
                }
                System.out.println("El número de vocales es: " + a);
                System.out.println("El número de consonantes es: " + b);
                break;
            case 29:
                a = 0;
                b = 0;
                c = 0;
                d = 0;
                e = 0;
                f = 0;

                for (g = 1; g <= 160; g++) {
                    System.out.print("Ingresa voto " + g + ": ");
                    h = scanner.nextInt();
                    switch (h) {
                        case 1:
                            a += 1;
                            break;
                        case 2:
                            b += 1;
                            break;
                        case 3:
                            c += 1;
                            break;
                        default:
                            d += 1;
                            break;
                    }
                }

                if (a > b && a > c && a > d) {
                    e = a;
                    System.out.println("El ganador con " + e + " votos es el candidato 1");
                } else if (b > a && b > c && b > d) {
                    e = b;
                    System.out.println("El ganador con " + e + " votos es el candidato 2");
                } else if (c > a && c > b && c > d) {
                    e = c;
                    System.out.println("El ganador con " + e + " votos es el candidato 3");
                } else {
                    System.out.println("Ningún candidato fue elegido");
                }
                break;
            case 30:
                System.out.print("Ingresa número 1: ");
                a = scanner.nextInt();
                System.out.print("Ingresa número 2: ");
                b = scanner.nextInt();
                ad = (a + b) / 2;
                System.out.println("El promedio es: " + ad);
                break;
            case 31:
                System.out.print("Ingresa número: ");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("enero");
                        break;
                    case 2:
                        System.out.println("febrero");
                        break;
                    case 3:
                        System.out.println("marzo");
                        break;
                    case 4:
                        System.out.println("abril");
                        break;
                    case 5:
                        System.out.println("mayo");
                        break;
                    case 6:
                        System.out.println("junio");
                        break;
                    case 7:
                        System.out.println("julio");
                        break;
                    case 8:
                        System.out.println("agosto");
                        break;
                    case 9:
                        System.out.println("septiembre");
                        break;
                    case 10:
                        System.out.println("octubre");
                        break;
                    case 11:
                        System.out.println("noviembre");
                        break;
                    case 12:
                        System.out.println("diciembre");
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}