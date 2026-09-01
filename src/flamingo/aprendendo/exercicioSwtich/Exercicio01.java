package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de combustível (1-Gasolina, 2-Etanol, 3-Diesel): ");
        int tipoCombustivel = sc.nextInt();

        System.out.print("Informe a quantidade de litros: ");
        double litros = sc.nextDouble();

        String nomeCombustivel = "";
        double precoPorLitro = 0;
        boolean opcaoValida = true;

        switch (tipoCombustivel) {
            case 1:
                nomeCombustivel = "Gasolina";
                precoPorLitro = 5.89;
                break;
            case 2:
                nomeCombustivel = "Etanol";
                precoPorLitro = 3.99;
                break;
            case 3:
                nomeCombustivel = "Diesel";
                precoPorLitro = 6.19;
                break;
            default:
                opcaoValida = false;
                System.out.println("Tipo de combustível inválido");
        }

        if (opcaoValida) {
            double valorTotal = litros * precoPorLitro;
            System.out.println("Combustível escolhido: " + nomeCombustivel + " Litros abastecidos: " + litros + " Valor total: R$ " + valorTotal);
        }

        sc.close();
    }
}