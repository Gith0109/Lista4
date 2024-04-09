import java.util.Scanner;

public class Questao7Lista4 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva 10 elementos inteiros");

        int [] n1 = new int [11];

        for (int x = 1 ; x < n1.length ; x++){
            n1[x] = ler.nextInt();
        }

        int [] y = new int [n1.length];

        System.out.println(" Números pares foram multiplicados por 2, impares foram multiplicados por 3.\n");
        for (int x = 1 ; x < y.length; x++){
            if (x % 2 == 0) {
                y[x] = n1[x] * 2;
                System.out.printf("%d x %d = %d\n", n1[x], 2, y[x] );
            }else {
                y[x] = n1[x] * 3;
                System.out.printf("%d x %d = %d\n", n1[x], 3, y[x] );
            }
        }

    }
}


