package flamingo.aprendendo.exercicioPratica;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        String mensagem = (idade >= 18) ? "Maior de idade." : "Menor de idade.";

        System.out.println(mensagem);

        sc.close();
    }
}
