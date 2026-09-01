package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o salario do usuario: ");
        double salario = sc.nextDouble();

        if (salario <= 1500) {
            System.out.println("Salario baixo.");
        } else if (salario <= 3000) {
            System.out.println("Salario medio.");
        } else if (salario <= 7000) {
            System.out.println("Salario bom.");
        } else {
            System.out.println("Salario alto.");
        }

        sc.close();
    }
}
