package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio08 {
    // 8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
    //brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
    //de eleitores.

    static void main(String[] args) {
        double eleitores, brancos, nulos, validos;
        double percentualBrancos, percentualNulos, percentualValidos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores ");
        eleitores = sc.nextDouble();

        System.out.print("Digite o número total de votos brancos ");
        brancos = sc.nextDouble();

        System.out.print("Digite o número total de votos nulos ");
        nulos = sc.nextDouble();

        System.out.print("Digite o número total de votos válidos ");
        validos = sc.nextDouble();

        percentualBrancos = ( brancos / eleitores) * 100;
        percentualNulos = ( nulos / eleitores) * 100;
        percentualValidos = ( validos / eleitores) * 100;

        System.out.printf("""
                 Total de %f Votos
                 Votos brancos = %f%%
                 Votos Nulos = %f%%
                 Votos Válidos = %f%%
                """, eleitores, brancos, nulos, validos);

        sc.close();

    }
}
