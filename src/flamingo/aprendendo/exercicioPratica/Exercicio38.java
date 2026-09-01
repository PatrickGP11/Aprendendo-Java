package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        System.out.print("Digite a presenca do aluno (%): ");
        double presenca = sc.nextDouble();

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperacao.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
