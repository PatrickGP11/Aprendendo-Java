package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 48. Matriz transposta
public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2]; // linhas e colunas invertidas

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                transposta[j][i] = matriz[i][j]; // inverte linha com coluna
            }
        }

        System.out.println("\nMatriz original:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz transposta:");
        for (int[] linha : transposta) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
