package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 8. Contar ímpares
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println("Quantidade de números ímpares: " + contadorImpares);

        scanner.close();
    }
}
