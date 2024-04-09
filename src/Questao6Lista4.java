import java.util.Scanner;

public class Questao6Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 30 números inteiros");

        int[] a = new int[30];
        for (int x = 0; x < a.length; x++) {
            a[x] = ler.nextInt();
        }
        for (int x = 1; x< a.length; x++)
            if (a[x] > 0) {
                System.out.printf("Em %dº está o número %d\n",x,a[x]);
            }
    }
}
