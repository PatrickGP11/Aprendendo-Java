package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 150) {
            System.out.println("Frete gratis.");
        } else {
            System.out.println("Frete de R$ 20,00.");
        }

        sc.close();
    }
}
