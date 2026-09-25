package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 22. Comparar dois arrays
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do primeiro array: ");
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do segundo array: ");
            array2[i] = scanner.nextInt();
        }

        boolean iguais = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                iguais = false;
                break; // já achamos diferença, não precisa continuar
            }
        }

        if (iguais) {
            System.out.println("Os arrays são iguais.");
        } else {
            System.out.println("Os arrays são diferentes.");
        }

        scanner.close();
    }
}
