package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de serviço (1-Banho, 2-Tosa, 3-Banho e tosa): ");
        int tipoServico = sc.nextInt();

        System.out.print("Informe o porte do animal (1-Pequeno, 2-Médio, 3-Grande): ");
        int porteAnimal = sc.nextInt();

        String nomeServico = "";
        String nomePorte = "";
        double valorTotal = 0;
        boolean opcaoValida = true;

        switch (porteAnimal) {
            case 1: nomePorte = "Pequeno"; break;
            case 2: nomePorte = "Médio"; break;
            case 3: nomePorte = "Grande"; break;
            default: opcaoValida = false;
        }

        switch (tipoServico) {
            case 1:
                nomeServico = "Banho";
                switch (porteAnimal) {
                    case 1: valorTotal = 40.00; break;
                    case 2: valorTotal = 55.00; break;
                    case 3: valorTotal = 70.00; break;
                }
                break;
            case 2:
                nomeServico = "Tosa";
                switch (porteAnimal) {
                    case 1: valorTotal = 50.00; break;
                    case 2: valorTotal = 65.00; break;
                    case 3: valorTotal = 80.00; break;
                }
                break;
            case 3:
                nomeServico = "Banho e tosa";
                switch (porteAnimal) {
                    case 1: valorTotal = 85.00; break;
                    case 2: valorTotal = 110.00; break;
                    case 3: valorTotal = 140.00; break;
                }
                break;
            default:
                opcaoValida = false;
        }

        if (opcaoValida) {
            System.out.println("Serviço escolhido: " + nomeServico + " Porte do animal: " + nomePorte + " Valor total: R$ " + valorTotal);
        } else {
            System.out.println("Serviço ou porte inválido");
        }

        sc.close();
    }
}
