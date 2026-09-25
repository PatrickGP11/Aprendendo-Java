package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 14. Mostrar valores ao contrário
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nValores na ordem inversa:");
        // Começa no último índice (length - 1) e decrementa até 0
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
