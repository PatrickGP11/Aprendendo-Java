package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 24. Somar apenas os pares
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);

        scanner.close();
    }
}
