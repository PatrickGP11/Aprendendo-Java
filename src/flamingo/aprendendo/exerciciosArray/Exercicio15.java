package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 15. Dobro dos valores
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nDobro de cada valor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " x 2 = " + (numeros[i] * 2));
        }

        scanner.close();
    }
}
