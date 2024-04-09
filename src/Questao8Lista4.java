import java.util.Scanner;

public class Questao8Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros");

        int[] M = new int[10];

        for (int x = 0; x < M.length; x++) {
            M[x] = ler.nextInt();
        }

        int[] A = new int[M.length];

        System.out.println("Números Realocados");

        for (int x = 0; x < M.length / 2; x++) {
            A[x] = M[x + 5];
            System.out.println(A[x]);
        }
        for (int x = 0; x < M.length / 2; x++) {
            A[x + 5] = M[x];
            System.out.println(A[x + 5]);
        }

    }
}
