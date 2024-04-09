public class Questao2Lista4 {

    public static void main(String[] args) {

        int [] a = new int[10];
        for (int x = 1; x <= a.length ; x++){
            a[x] += x * 10;
            System.out.println(a[x]);
        }
    }
}
