package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o total gasto pelo cliente no mes: ");
        double totalGasto = sc.nextDouble();

        if (totalGasto <= 100) {
            System.out.println("Cliente comum.");
        } else if (totalGasto <= 500) {
            System.out.println("Cliente bronze.");
        } else if (totalGasto <= 1000) {
            System.out.println("Cliente prata.");
        } else {
            System.out.println("Cliente ouro.");
        }

        sc.close();
    }
}
