import java.util.Scanner;

public class Questao5Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 10 elementos que serão multiplicados");

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        for (int x = 0; x < a.length; x++) {
            a[x] = ler.nextInt();
        }
        System.out.println("Digite mais 10 elementos que vão ser o multiplicador");
        for (int x = 0; x < b.length; x++) {
            b[x] = ler.nextInt();
        }
        System.out.println("O resultado dessas multiplicação são:");

        for (int x = 0; x < c.length; x++) {
            c[x] = a[x] * b [x];
            System.out.printf("%d * %d = %d\n", a[x], b[x], c[x]);
        }

    }
}
