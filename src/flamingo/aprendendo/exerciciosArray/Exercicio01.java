package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 1. Guardando nomes
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        // Preenche o array pedindo um nome por posição
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Percorre o array novamente para exibir tudo
        System.out.println("\nNomes cadastrados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + " - " + nomes[i]);
        }

        scanner.close();
    }
}
