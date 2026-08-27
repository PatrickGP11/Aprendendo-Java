package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class PostoDeCombustivel {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe o tipo de combustível (1-Gasolina, 2-Etanol, 3-Diesel): ");
        int tipoCombustivel = sc.nextInt();

        System.out.printf("Informe a quantidade de litros: ");
        double litros = sc.nextDouble();

        String nomeCombustivel = "";
        double precoPorLitro = 0;
        boolean opcaoValida = true;

        switch (tipoCombustivel) {
            case 1:
            nomeCombustivel = "Gasolina ";
            precoPorLitro = 5.89;
            break;
            case 2:
                nomeCombustivel = "Etanol ";
                precoPorLitro = 3.99;
                break;
            case 3:
                nomeCombustivel = "Diesel ";
                precoPorLitro = 6.19;
                break;
            default:
                opcaoValida = false;
                System.out.printf("Tipo de combustível inválido ");
        }
        if (opcaoValida) {
            double valorTotal = litros * precoPorLitro;
            System.out.printf("Combustível escolhido: " + nomeCombustivel + "Litros abastecidos: " + litros + "Valor total: R$ " + valorTotal);
        }
        sc.close();
    }
}
