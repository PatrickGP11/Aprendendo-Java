package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o plano (1-Básico, 2-Profissional, 3-Premium): ");
        int plano = sc.nextInt();

        System.out.print("Informe a quantidade de meses: ");
        int meses = sc.nextInt();

        String nomePlano = "";
        double valorMensal = 0;
        boolean opcaoValida = true;

        switch (plano) {
            case 1:
                nomePlano = "Básico";
                valorMensal = 29.90;
                break;
            case 2:
                nomePlano = "Profissional";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                opcaoValida = false;
                System.out.println("Plano inválido");
        }

        if (opcaoValida) {
            double valorTotal = valorMensal * meses;
            String descontoTxt = "0%";

            if (meses == 12) {
                valorTotal = valorTotal * 0.90; // 10% de desconto
                descontoTxt = "10%";
            }

            System.out.println("Plano escolhido: " + nomePlano + " Meses contratados: " + meses + " Desconto aplicado: " + descontoTxt + " Valor final: R$ " + valorTotal);
        }

        sc.close();
    }
}
