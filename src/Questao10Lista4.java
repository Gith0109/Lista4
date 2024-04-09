import java.util.Scanner;

public class Questao10Lista4 {

    public static void main(String[] args) {

        int NumerosPares = 0, NumerosImpares = 0;

        Scanner ler = new Scanner(System.in);

        int[] Par = new int[10];
        int[] Impar = new int[10];
        int [] n1 = new int [10];
        System.out.println("Coloque os números a serem organizados ");


        for (int x = 0; x < n1.length; x++) {
            n1[x] = ler.nextInt();
            if (n1[x] % 2 == 0) {
                Par[x] = n1[x];
                NumerosPares++;
            } else {
                Impar[x] = n1[x];
                NumerosImpares++;
            }
        }
        System.out.println("Números Pares");
        if (NumerosPares > 0) {
            for (int x = 0; x < Par.length; x++) {
                if (Par[x] == 0) {
                    continue;
                }
                System.out.println(Par[x]);
            }
        } else {
            System.out.println("Nenhum");
        }

        System.out.println("Números Impares");
        if (NumerosImpares > 0) {
            for (int x = 0; x < Impar.length; x++) {
                if (Impar[x] == 0) {
                    continue;
                }
                System.out.println(Impar[x]);
            }
        } else {
            System.out.println("Nenhum");
        }
    }
}