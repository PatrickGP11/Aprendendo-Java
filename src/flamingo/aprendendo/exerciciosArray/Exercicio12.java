package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 12. Buscar número e posição
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nDigite um número para pesquisar: ");
        int pesquisado = scanner.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado na posição " + posicao);
        } else {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}
