package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        String resultado = (nota >= 7) ? "Aprovado." : "Reprovado.";

        System.out.println(resultado);

        sc.close();
    }
}
