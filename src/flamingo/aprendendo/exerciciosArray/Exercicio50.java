package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 50. Estoque por loja
public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lojas = 3;
        int produtos = 5;
        int[][] estoque = new int[lojas][produtos]; // linha = loja, coluna = produto

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Quantidade do produto " + (j + 1) + " na loja " + (i + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
            }
        }

        // Total por loja: soma as colunas de cada linha
        System.out.println("\nTotal de produtos por loja:");
        int[] totalPorLoja = new int[lojas];
        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                totalPorLoja[i] += estoque[i][j];
            }
            System.out.println("Loja " + (i + 1) + ": " + totalPorLoja[i]);
        }

        // Total por produto: soma as linhas de cada coluna
        System.out.println("\nTotal de cada produto (somando todas as lojas):");
        for (int j = 0; j < produtos; j++) {
            int totalProduto = 0;
            for (int i = 0; i < estoque.length; i++) {
                totalProduto += estoque[i][j];
            }
            System.out.println("Produto " + (j + 1) + ": " + totalProduto);
        }

        // Loja com mais produtos em estoque
        int lojaComMais = 0;
        for (int i = 1; i < totalPorLoja.length; i++) {
            if (totalPorLoja[i] > totalPorLoja[lojaComMais]) {
                lojaComMais = i;
            }
        }
        System.out.println("\nA loja com mais produtos em estoque é a loja " + (lojaComMais + 1));

        scanner.close();
    }
}
