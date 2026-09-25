package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 13. Contar repetição de um número
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nDigite um número para contar quantas vezes aparece: ");
        int pesquisado = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisado) {
                contador++;
            }
        }

        System.out.println("O número " + pesquisado + " apareceu " + contador + " vez(es).");

        sc.close();
    }
}
