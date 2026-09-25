package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 10. Notas acima da média
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        // Primeiro laço: preencher e somar
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("\nMédia da turma: " + media);

        // Segundo laço: comparar cada nota com a média já calculada
        System.out.println("Notas acima da média:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        scanner.close();
    }
}
