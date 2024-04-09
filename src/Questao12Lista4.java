import java.util.Scanner;

public class Questao12Lista4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[6];
        int soma = 0;
        int multiplicacao = 1;

        int n1;
        float media;

        System.out.println("Digite 6 valores: ");

        for (int x = 0; x < numeros.length; x++) {
            numeros[x] = ler.nextInt();
            soma += numeros[x];
        }

        System.out.println("Escolha a opcao desejada:");
        System.out.println("1- Soma dos elementos");
        System.out.println("2- Produto dos elementos");
        System.out.println("3- Média dos elementos");
        System.out.println("4- Mostre o vetor");

        n1 = ler.nextInt();

        switch (n1){
            case 1:
                System.out.printf("A soma dos elementos é: %d ", soma);
                break;
            case 2:
                for (int i = 0; i < numeros.length; i++) {
                    multiplicacao *= numeros[i];
                }
                System.out.printf("O produto dos elementos é: %d ", multiplicacao);
                break;
            case 3:
                media = (float) soma / numeros.length;
                System.out.printf("A média dos elementos é: %.2f" , media);
                break;
            case 4:
                for (int vetor : numeros){
                    System.out.println(vetor);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }


    }
}