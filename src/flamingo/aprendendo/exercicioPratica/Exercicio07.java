package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor recebido por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite quantas horas trabalhou no mes: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.println("O salario bruto e R$ " + salarioBruto);

        sc.close();
    }
}
