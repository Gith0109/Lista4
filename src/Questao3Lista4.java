public class Questao3Lista4 {

    public static void main(String[] args) {

        int [] b = new int [10];
        for (int x = 0 ; x < b.length ; x++ ){
            if (x % 2 == 0) {
                b[x] = 20;
                System.out.printf("%d Par\n", b[x]);
            }else{
                b[x] = 10;
                System.out.printf("%d Impar\n", b[x]);
            }
        }
    }
}
