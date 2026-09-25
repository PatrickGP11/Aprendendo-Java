package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 40. Soma da diagonal principal
public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (i == j) { // só soma quando estiver na diagonal principal
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + soma);

        scanner.close();
    }
}
