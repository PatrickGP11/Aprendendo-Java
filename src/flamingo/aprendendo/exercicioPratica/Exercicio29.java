package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        double valorFinal;

        if (valor >= 200) {
            valorFinal = valor * 0.9;
        } else {
            valorFinal = valor;
        }

        System.out.println("O valor final da compra e R$ " + valorFinal);

        sc.close();
    }
}
