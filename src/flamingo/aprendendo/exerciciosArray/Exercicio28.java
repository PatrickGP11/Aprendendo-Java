package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 28. Relatório de alunos
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // limpa a quebra de linha deixada pelo nextDouble()
        }

        System.out.println("\n--- Relatório de Alunos ---");
        // Mesmo índice "i" liga o nome à nota correspondente nos dois arrays
        for (int i = 0; i < nomes.length; i++) {
            String situacao = notas[i] >= 7 ? "Aprovado" : "Reprovado";
            System.out.println(nomes[i] + " | Nota: " + notas[i] + " | " + situacao);
        }

        scanner.close();
    }
}
