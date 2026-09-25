package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 44. Buscar valor na matriz
public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("\nDigite um número para pesquisar: ");
        int pesquisado = scanner.nextInt();

        boolean encontrado = false;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        for (int i = 0; i < matriz.length && !encontrado; i++) {
            for (int j = 0; j < matriz[i].length && !encontrado; j++) {
                if (matriz[i][j] == pesquisado) {
                    encontrado = true;
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                }
            }
        }

        if (encontrado) {
            System.out.println("Encontrado na linha " + linhaEncontrada + ", coluna " + colunaEncontrada);
        } else {
            System.out.println("Número não encontrado na matriz.");
        }

        scanner.close();
    }
}
