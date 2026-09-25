package flamingo.aprendendo.exerciciosArray;

import java.util.Scanner;

// 27. Contar nomes que começam com a letra A
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];
        int contador = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            // charAt(0) pega o primeiro caractere da String
            if (Character.toUpperCase(nomes[i].charAt(0)) == 'A') {
                contador++;
            }
        }

        System.out.println("Quantidade de nomes que começam com A: " + contador);

        scanner.close();
    }
}
