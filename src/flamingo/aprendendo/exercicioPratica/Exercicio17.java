package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        sc.close();
    }
}
