package flamingo.aprendendo.basico.ExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n === MENU === ");
            System.out.println(" === CADASTRO DE USUÁRIO");
            System.out.println(" === LISTAR USUÁRIOS ===");
            System.out.println(" === SAIR ===");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) System.out.println("Opção selecionada: Cadastrar usuário.");
            else if (opcao == 2) System.out.println("Opção selecionada: Listar usuários.");

        }while (opcao != 3);
        System.out.println("Sistema encerrado");
        sc.close();
    }
}

