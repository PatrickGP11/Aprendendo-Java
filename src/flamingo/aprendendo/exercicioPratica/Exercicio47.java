package flamingo.aprendendo.exercicioPratica;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: hamburguer - R$ 25,00");
        System.out.println("2: pizza - R$ 40,00");
        System.out.println("3: salada - R$ 18,00");
        System.out.println("4: refrigerante - R$ 8,00");

        System.out.print("Digite a opcao escolhida: ");
        int opcao = sc.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double preco;

        switch (opcao) {
            case 1:
                preco = 25.00;
                break;
            case 2:
                preco = 40.00;
                break;
            case 3:
                preco = 18.00;
                break;
            case 4:
                preco = 8.00;
                break;
            default:
                System.out.println("Opcao invalida.");
                preco = 0;
        }

        double valorTotal = preco * quantidade;

        System.out.println("O valor total do pedido e R$ " + valorTotal);

        sc.close();
    }
}
