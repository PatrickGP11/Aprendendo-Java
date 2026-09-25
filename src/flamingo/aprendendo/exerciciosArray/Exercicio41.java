package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 41. Diagonal secundária
public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nValores da diagonal secundária:");
        // Na diagonal secundária: coluna = (tamanho - 1) - linha
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.println(matriz[i][n - 1 - i]);
        }

        scanner.close();
    }
}
