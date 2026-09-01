package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saque <= saldo) {
            double saldoRestante = saldo - saque;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo restante: R$ " + saldoRestante);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}
