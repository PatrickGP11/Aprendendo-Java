package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double frete = (valor >= 150) ? 0 : 20;

        System.out.println("O valor do frete e R$ " + frete);

        sc.close();
    }
}
