package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 19. Trocar primeiro e último valor
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Padrão clássico de troca (swap) usando variável auxiliar
        int temporario = numeros[0];
        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = temporario;

        System.out.println("\nArray após a troca:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
