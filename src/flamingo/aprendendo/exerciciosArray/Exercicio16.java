package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 16. Criar segundo array com dobro
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] dobros = new int[5]; // segundo array com o mesmo tamanho

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            dobros[i] = numeros[i] * 2; // preenche o novo array já com o dobro
        }

        System.out.println("\nArray original x Array com o dobro:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " -> " + dobros[i]);
        }

        scanner.close();
    }
}
