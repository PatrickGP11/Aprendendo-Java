package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 18. Maior e menor nota
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[6];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double maior = notas[0];
        double menor = notas[0];

        // Um único laço já resolve maior, menor (a soma já foi feita acima)
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média da turma: " + media);

        scanner.close();
    }
}
