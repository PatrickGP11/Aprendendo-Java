package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC e " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal.");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        sc.close();
    }
}
