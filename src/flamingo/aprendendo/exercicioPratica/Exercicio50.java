package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("1: basico - R$ 29,90 por mes");
        System.out.println("2: intermediario - R$ 59,90 por mes");
        System.out.println("3: premium - R$ 99,90 por mes");

        System.out.print("Digite o plano escolhido: ");
        int plano = sc.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();

        String nomePlano;
        double valorMensal;

        switch (plano) {
            case 1:
                nomePlano = "Basico";
                valorMensal = 29.90;
                break;
            case 2:
                nomePlano = "Intermediario";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                nomePlano = "Invalido";
                valorMensal = 0;
        }

        double valorSemDesconto = valorMensal * meses;
        double desconto = (meses >= 12) ? valorSemDesconto * 0.10 : 0;
        double valorFinal = valorSemDesconto - desconto;

        System.out.println("Plano: " + nomePlano);
        System.out.println("Valor mensal: R$ " + valorMensal);
        System.out.println("Quantidade de meses: " + meses);
        System.out.println("Valor sem desconto: R$ " + valorSemDesconto);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final do contrato: R$ " + valorFinal);

        sc.close();
    }
}
