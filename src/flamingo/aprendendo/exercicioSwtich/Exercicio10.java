package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o produto (1-Açaí, 2-Sorvete, 3-Milkshake): ");
        int produto = sc.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = sc.nextInt();

        System.out.print("Tem adicional? (true/false): ");
        boolean temAdicional = sc.nextBoolean();

        String nomeProduto = "";
        double precoBase = 0;
        boolean opcaoValida = true;

        switch (produto) {
            case 1:
                nomeProduto = "Açaí";
                precoBase = 18.00;
                break;
            case 2:
                nomeProduto = "Sorvete";
                precoBase = 12.00;
                break;
            case 3:
                nomeProduto = "Milkshake";
                precoBase = 20.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Produto inválido");
        }

        if (opcaoValida) {
            double precoAdicionalUnitario = temAdicional ? 5.00 : 0.00;
            double valorTotal = (quantidade * precoBase) + (quantidade * precoAdicionalUnitario);
            String textoAdicional = temAdicional ? "Sim" : "Não";

            System.out.println("Produto escolhido: " + nomeProduto + " Quantidade: " + quantidade + " Adicional: " + textoAdicional + " Valor total: R$ " + valorTotal);
        }

        sc.close();
    }
}
