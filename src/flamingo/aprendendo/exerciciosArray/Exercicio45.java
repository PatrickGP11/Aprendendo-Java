package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 45. Trocar linha 0 com linha 2
public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Troca coluna por coluna entre a linha 0 e a linha 2
        for (int j = 0; j < matriz[0].length; j++) {
            int temporario = matriz[0][j];
            matriz[0][j] = matriz[2][j];
            matriz[2][j] = temporario;
        }

        System.out.println("\nMatriz após trocar linha 0 com linha 2:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
