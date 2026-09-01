package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(celsius + " C equivalem a " + fahrenheit + " F.");

        sc.close();
    }
}
