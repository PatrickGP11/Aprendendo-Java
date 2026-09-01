package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a porcentagem de presenca do aluno: ");
        double presenca = sc.nextDouble();

        if (presenca >= 75) {
            System.out.println("Presenca suficiente.");
        }

        sc.close();
    }
}
