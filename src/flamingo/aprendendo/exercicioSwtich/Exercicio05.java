package flamingo.aprendendo.exercicioSwtich;


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o produto (1-Camiseta, 2-Calça, 3-Jaqueta, 4-Tênis): ");
        int tipoProduto = sc.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = sc.nextInt();

        String nomeProduto = "";
        double precoUnitario = 0;
        boolean opcaoValida = true;

        switch (tipoProduto) {
            case 1:
                nomeProduto = "Camiseta";
                precoUnitario = 49.90;
                break;
            case 2:
                nomeProduto = "Calça";
                precoUnitario = 119.90;
                break;
            case 3:
                nomeProduto = "Jaqueta";
                precoUnitario = 199.90;
                break;
            case 4:
                nomeProduto = "Tênis";
                precoUnitario = 249.90;
                break;
            default:
                opcaoValida = false;
                System.out.println("Produto inválido");
        }

        if (opcaoValida) {
            double valorTotal = quantidade * precoUnitario;
            String descontoTxt = "0%";

            if (quantidade >= 3) {
                valorTotal = valorTotal * 0.85; // 15% de desconto
                descontoTxt = "15%";
            }

            System.out.println("Produto escolhido: " + nomeProduto + " Quantidade: " + quantidade + " Desconto aplicado: " + descontoTxt + " Valor final: R$ " + valorTotal);
        }

        sc.close();
    }
}