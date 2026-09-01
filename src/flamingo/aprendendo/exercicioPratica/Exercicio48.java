package flamingo.aprendendo.exercicioPratica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("1: soma");
        System.out.println("2: subtracao");
        System.out.println("3: multiplicacao");
        System.out.println("4: divisao");

        System.out.print("Digite a operacao escolhida: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Nao e possivel dividir por zero.");
                }
                break;
            default:
                System.out.println("Operacao invalida.");
        }

        sc.close();
    }
}
