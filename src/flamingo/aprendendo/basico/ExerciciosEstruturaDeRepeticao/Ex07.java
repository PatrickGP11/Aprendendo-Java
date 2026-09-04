package flamingo.aprendendo.basico.ExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vendas realizadas: ");
        int quantidadeVendas = sc.nextInt();

        double valorVenda = 50.0;
        double faturamentoTotal = 0;

        for (int i = 0; i < quantidadeVendas; i++) {
            faturamentoTotal += valorVenda;
        }
        System.out.println("Quantidade de vendas: " + quantidadeVendas + "Faturamento total: " + faturamentoTotal);
        sc.close();
    }
}
