package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o nome do funcionario: ");
        String nome = sc.nextLine();

        System.out.print("Digite o cargo do funcionario: ");
        String cargo = sc.nextLine();

        System.out.print("Digite o salario do funcionario: ");
        double salario = sc.nextDouble();

        System.out.print("O funcionario esta ativo? (true/false): ");
        boolean ativo = sc.nextBoolean();

        String situacao = ativo ? "ativo" : "inativo";

        System.out.println(nome + " ocupa o cargo de " + cargo + ", recebe R$ " + salario + " e esta " + situacao + " na empresa.");

        sc.close();
    }
}
