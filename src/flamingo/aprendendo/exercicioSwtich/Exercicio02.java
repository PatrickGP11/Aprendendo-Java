package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a opção (1-Hambúrguer, 2-Pizza, 3-Batata frita, 4-Refrigerante, 5-Suco): ");
        int opcaoLanche = sc.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = sc.nextInt();

        String item = "";
        double precoUnitario = 0;
        boolean opcaoValida = true;

        switch (opcaoLanche) {
            case 1:
                item = "Hambúrguer";
                precoUnitario = 25.00;
                break;
            case 2:
                item = "Pizza";
                precoUnitario = 40.00;
                break;
            case 3:
                item = "Batata frita";
                precoUnitario = 18.00;
                break;
            case 4:
                item = "Refrigerante";
                precoUnitario = 8.00;
                break;
            case 5:
                item = "Suco";
                precoUnitario = 10.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Opção inválida");
        }

        if (opcaoValida) {
            double valorTotal = quantidade * precoUnitario;
            System.out.println("Item escolhido: " + item + " Quantidade: " + quantidade + " Total do pedido: R$ " + valorTotal);
        }

        sc.close();
    }
}
