package flamingo.aprendendo.exercicioPratica;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idadeAproximada = anoAtual - anoNascimento;

        System.out.println("Sua idade aproximada e " + idadeAproximada + " anos.");

        sc.close();
    }
}
