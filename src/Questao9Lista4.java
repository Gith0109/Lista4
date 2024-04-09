import java.util.Scanner;

public class Questao9Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        int [] A = new int [10];
        int [] B = new int [10];
        System.out.println("Digite 10 Elementos que serão somados:");

        for (int x = 0 ; x < A.length; x++) {
            A[x] = ler.nextInt();
        }
        System.out.println("Digite mais 10 Elementos que serão somados com os anteriores:");
        for (int x = 0 ; x < B.length; x++) {
            B[x] = ler.nextInt();
        }

        int [] C = new int [10];
        System.out.println("Os resultados somados ficam:\n");
        for (int x = 0 ; x < C.length; x++) {
            C[x] = A[x] + B[x];
            System.out.printf("%d + %d = %d\n", A[x], B[x], C[x]);
        }

    }
}
