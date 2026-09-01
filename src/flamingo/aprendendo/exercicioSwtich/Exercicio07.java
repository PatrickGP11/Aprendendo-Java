package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a região (1-Sudeste, 2-Sul, 3-Nordeste, 4-Norte, 5-Centro-Oeste): ");
        int regiao = sc.nextInt();

        System.out.print("Informe o valor do produto: ");
        double valorProduto = sc.nextDouble();

        String nomeRegiao = "";
        double frete = 0;
        boolean opcaoValida = true;

        switch (regiao) {
            case 1:
                nomeRegiao = "Sudeste";
                frete = 20.00;
                break;
            case 2:
                nomeRegiao = "Sul";
                frete = 25.00;
                break;
            case 3:
                nomeRegiao = "Nordeste";
                frete = 35.00;
                break;
            case 4:
                nomeRegiao = "Norte";
                frete = 45.00;
                break;
            case 5:
                nomeRegiao = "Centro-Oeste";
                frete = 30.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Região inválida");
        }

        if (opcaoValida) {
            if (valorProduto >= 300.00) {
                frete = 0.00;
            }

            double valorFinal = valorProduto + frete;
            System.out.println("Região: " + nomeRegiao + " Valor do produto: R$ " + valorProduto + " Frete: R$ " + frete + " Valor final: R$ " + valorFinal);
        }

        sc.close();
    }
}