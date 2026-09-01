package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o salario do funcionario: ");
        double salario = sc.nextDouble();

        double bonus = (salario < 3000) ? 500 : 200;
        double total = salario + bonus;

        System.out.println("Salario: R$ " + salario);
        System.out.println("Bonus: R$ " + bonus);
        System.out.println("Total: R$ " + total);

        sc.close();
    }
}
