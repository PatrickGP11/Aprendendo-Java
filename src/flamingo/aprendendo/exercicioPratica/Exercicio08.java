package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite um numero: ");
        double numero = sc.nextDouble();

        double dobro = numero * 2;
        double metade = numero / 2;

        System.out.println("O dobro de " + numero + " e " + dobro);
        System.out.println("A metade de " + numero + " e " + metade);

        sc.close();
    }
}
