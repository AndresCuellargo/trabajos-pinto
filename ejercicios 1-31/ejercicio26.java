public class ejercicio26 {
    public static void main(String[] args) {
        int A = 0;
        int B = 1;
        int C = A + B;

        System.out.println(A);
        System.out.println(B);

        while (C < 100000) {
            System.out.println(C);
            A = B;
            B = C;
            C = A + B;
        }
    }
}
