package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.print("Digite o valor unitario do produto: ");
        double valorUnitario = sc.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        double valorTotal = valorUnitario * quantidade;

        System.out.println("O valor total da compra de " + produto + " foi de R$ " + valorTotal);

        sc.close();
    }
}
