package flamingo.aprendendo.exercicioPratica;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de XP do jogador: ");
        int xp = sc.nextInt();

        if (xp < 1000) {
            System.out.println("Iniciante.");
        } else if (xp <= 4999) {
            System.out.println("Intermediario.");
        } else if (xp <= 9999) {
            System.out.println("Avancado.");
        } else {
            System.out.println("Lendario.");
        }

        sc.close();
    }
}
