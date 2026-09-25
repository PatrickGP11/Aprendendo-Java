package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 49. Vendas por vendedor
public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] vendas = new int[3][4]; // 3 vendedores, 4 vendas cada
        int[] totais = new int[3];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Venda " + (j + 1) + " do vendedor " + (i + 1) + ": ");
                vendas[i][j] = scanner.nextInt();
                totais[i] += vendas[i][j]; // acumula o total da linha (vendedor)
            }
        }

        int maiorVendedor = 0;
        System.out.println("\nTotal vendido por vendedor:");
        for (int i = 0; i < totais.length; i++) {
            System.out.println("Vendedor " + (i + 1) + ": " + totais[i]);
            if (totais[i] > totais[maiorVendedor]) {
                maiorVendedor = i;
            }
        }

        System.out.println("O vendedor que mais vendeu foi o vendedor " + (maiorVendedor + 1));

        scanner.close();
    }
}
