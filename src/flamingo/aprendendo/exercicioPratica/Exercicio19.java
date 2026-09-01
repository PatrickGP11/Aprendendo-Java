package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite um numero: ");
        double numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("Numero negativo.");
        }

        sc.close();
    }
}
