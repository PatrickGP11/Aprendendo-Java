package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a velocidade do veiculo: ");
        double velocidade = sc.nextDouble();

        if (velocidade > 80) {
            System.out.println("Voce foi multado.");
        }

        sc.close();
    }
}
