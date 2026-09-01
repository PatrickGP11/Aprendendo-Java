package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        if (saldo > 0) {
            System.out.println("Voce possui saldo disponivel.");
        }

        sc.close();
    }
}
