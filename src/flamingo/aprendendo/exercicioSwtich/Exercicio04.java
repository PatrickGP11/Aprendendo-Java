package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de veículo (1-Moto, 2-Carro, 3-Caminhonete): ");
        int tipoVeiculo = sc.nextInt();

        System.out.print("Informe a quantidade de horas: ");
        int horas = sc.nextInt();

        String nomeVeiculo = "";
        double valorHora = 0;
        boolean opcaoValida = true;

        switch (tipoVeiculo) {
            case 1:
                nomeVeiculo = "Moto";
                valorHora = 5.00;
                break;
            case 2:
                nomeVeiculo = "Carro";
                valorHora = 10.00;
                break;
            case 3:
                nomeVeiculo = "Caminhonete";
                valorHora = 15.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Tipo de veículo inválido");
        }

        if (opcaoValida) {
            double taxaAdicional = 0;
            if (horas > 5) {
                taxaAdicional = 10.00;
            }

            double valorTotal = (horas * valorHora) + taxaAdicional;
            System.out.println("Veículo: " + nomeVeiculo + " Horas estacionado: " + horas + " Taxa adicional: R$ " + taxaAdicional + " Valor total: R$ " + valorTotal);
        }

        sc.close();
    }
}