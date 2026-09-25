package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 21. Somar dois arrays
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] soma = new int[5];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do primeiro array: ");
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do segundo array: ");
            array2[i] = scanner.nextInt();
        }

        for (int i = 0; i < soma.length; i++) {
            soma[i] = array1[i] + array2[i]; // soma posição a posição
        }

        System.out.println("\nArray resultado (soma):");
        for (int valor : soma) {
            System.out.println(valor);
        }

        scanner.close();
    }
}
