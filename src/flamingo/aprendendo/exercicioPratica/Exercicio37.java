package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double percentualDesconto;

        if (valor <= 100) {
            percentualDesconto = 0;
        } else if (valor <= 300) {
            percentualDesconto = 0.05;
        } else if (valor <= 500) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double desconto = valor * percentualDesconto;
        double valorFinal = valor - desconto;

        System.out.println("Valor original: R$ " + valor);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}
