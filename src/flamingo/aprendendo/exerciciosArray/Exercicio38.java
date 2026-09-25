package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 38. Boletim com nomes
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("  Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // limpa quebra de linha do nextDouble()
        }

        System.out.println("\n--- Boletim ---");
        // O índice "i" do array de nomes é o mesmo índice da linha da matriz de notas
        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            String situacao = media >= 7 ? "Aprovado" : "Reprovado";

            System.out.print(nomes[i] + " | Notas: ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println("| Média: " + media + " | " + situacao);
        }

        scanner.close();
    }
}
