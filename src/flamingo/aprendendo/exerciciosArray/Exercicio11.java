package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 11. Buscar nome
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("\nDigite um nome para pesquisar: ");
        String pesquisado = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(pesquisado)) { // Strings sempre com .equals()
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado.");
        }

        scanner.close();
    }
}
