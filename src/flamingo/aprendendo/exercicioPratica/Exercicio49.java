package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("1: gasolina - R$ 5,80");
        System.out.println("2: etanol - R$ 4,20");
        System.out.println("3: diesel - R$ 6,00");

        System.out.print("Digite o tipo de combustivel: ");
        int tipo = sc.nextInt();

        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();

        double precoLitro;

        switch (tipo) {
            case 1:
                precoLitro = 5.80;
                break;
            case 2:
                precoLitro = 4.20;
                break;
            case 3:
                precoLitro = 6.00;
                break;
            default:
                System.out.println("Tipo invalido.");
                precoLitro = 0;
        }

        double valorTotal = precoLitro * litros;

        System.out.println("O valor total a pagar e R$ " + valorTotal);

        sc.close();
    }
}
