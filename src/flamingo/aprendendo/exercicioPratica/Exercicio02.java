package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a nota final do aluno: ");
        double notaFinal = sc.nextDouble();

        System.out.println("O aluno " + nome + ", de " + idade + " anos, obteve nota final " + notaFinal + ".");

        sc.close();
    }
}
