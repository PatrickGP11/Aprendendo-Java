package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 39. Diagonal principal
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nValores da diagonal principal:");
        // Na diagonal principal, o índice da linha é igual ao da coluna
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }

        scanner.close();
    }
}
