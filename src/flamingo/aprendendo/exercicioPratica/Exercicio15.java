package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a temperatura atual: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Esta muito quente hoje.");
        }

        sc.close();
    }
}
