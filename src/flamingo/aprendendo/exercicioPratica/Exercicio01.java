package flamingo.aprendendo.exercicioPratica;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = sc.nextLine();

        System.out.println("Ola, meu nome e " + nome + ", tenho " + idade + " anos e moro em " + cidade + ".");

        sc.close();
    }
}
