package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 7. Contar pares
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPares);

        scanner.close();
    }
}
