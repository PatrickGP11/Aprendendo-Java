package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente.");
        } else if (nota >= 7) {
            System.out.println("Bom.");
        } else if (nota >= 5) {
            System.out.println("Recuperacao.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
