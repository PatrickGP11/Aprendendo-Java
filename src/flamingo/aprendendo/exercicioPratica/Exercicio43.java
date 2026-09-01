package flamingo.aprendendo.exercicioPratica;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "Par." : "Impar.";

        System.out.println(resultado);

        sc.close();
    }
}
