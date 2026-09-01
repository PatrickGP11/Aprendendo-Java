package flamingo.aprendendo.exercicioPratica;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Voce tem CNH? (true/false): ");
        boolean temCnh = sc.nextBoolean();

        if (idade >= 18 && temCnh) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Nao pode dirigir.");
        }

        sc.close();
    }
}
