package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 23. Multiplicar todos os valores
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite o número multiplicador: ");
        int multiplicador = scanner.nextInt();

        System.out.println("Valores multiplicados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " x " + multiplicador + " = " + (numeros[i] * multiplicador));
        }

        scanner.close();
    }
}
