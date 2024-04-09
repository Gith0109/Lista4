import java.util.Arrays;
import java.util.Scanner;

public class Questao11Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os 20 valores do vetor Z: ");

        int[] n1 = new int[20];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = ler.nextInt();
        }
        Arrays.sort(n1);
        for (int n2 : n1){
            System.out.println(n2);
        }

    }
}

