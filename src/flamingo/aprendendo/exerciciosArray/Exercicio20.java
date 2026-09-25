package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 20. Verificar número repetido
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        boolean existeRepetido = false;

        // Laço duplo: compara cada elemento com todos os que vêm depois dele
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    existeRepetido = true;
                }
            }
        }

        if (existeRepetido) {
            System.out.println("Existe número repetido no array.");
        } else {
            System.out.println("Não existe número repetido.");
        }

        scanner.close();
    }
}
