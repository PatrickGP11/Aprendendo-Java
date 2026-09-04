package flamingo.aprendendo.basico.ExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos no carrinho");
        int quantidadeProdutos = sc.nextInt();

        double totalCompra = 0;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.printf("Digite o valor do produto: " + i + "R$ ");
            double valorProduto = sc.nextDouble();
            totalCompra += valorProduto;
        }
        System.out.println("Quantidade de produto: " + quantidadeProdutos + "Total da compra: R$ " + totalCompra);
        sc.close();
    }
}
