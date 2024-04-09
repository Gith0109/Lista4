import java.util.Scanner;

public class Questao13Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("Digite 10 Números");
        for (int x = 0; x < A.length; x++) {
            A[x] = ler.nextInt();
        }
        System.out.println("Digite mais 10 Números");
        for (int x = 0; x < B.length; x++) {
            B[x] = ler.nextInt();
        }
        System.out.println("Os números que repetem em ambos é:");
        for (int x = 0; x < C.length; x++) {
            if (A[x] % B[x] == 0) {
                C[x] = A[x];
                System.out.println(C[x]);
            }

        }
    }
}
