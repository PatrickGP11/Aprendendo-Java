package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 3. Soma de números
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // acumula a soma enquanto preenche
        }

        System.out.println("A soma total é: " + soma);

        scanner.close();
    }
}
