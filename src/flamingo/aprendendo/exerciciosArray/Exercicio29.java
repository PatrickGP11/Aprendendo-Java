package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 29. Menu de busca
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Listar todos os produtos");
            System.out.println("2 - Buscar produto pelo nome");
            System.out.println("3 - Mostrar quantidade de produtos cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    for (String produto : produtos) {
                        System.out.println("- " + produto);
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (String produto : produtos) {
                        if (produto.equalsIgnoreCase(busca)) {
                            encontrado = true;
                            break;
                        }
                    }
                    System.out.println(encontrado ? "Produto encontrado!" : "Produto não encontrado.");
                    break;
                case 3:
                    System.out.println("Quantidade de produtos: " + produtos.length);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
