import java.util.Scanner;

public class Questao4Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int QuanPar = 0, Quan = 0,QuanImpar = 0;
        System.out.println("Digite 20 elementos inteiros");

        int [] a = new int[20];
        for (int x = 0 ; x < a.length; x++){
            a[x] = ler.nextInt();
            Quan++;
            if (a[x] % 2 == 0) {
                QuanPar++;
            }else {
                QuanImpar++;
            }
        }
        System.out.printf("Dos %d valores que colocou foram %d pares e %d impares\n", Quan, QuanPar, QuanImpar);
    }
}
