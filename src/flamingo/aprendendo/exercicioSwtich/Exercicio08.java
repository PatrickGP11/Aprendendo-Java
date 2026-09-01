package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de ingresso (1-Inteira, 2-Meia-entrada, 3-VIP): ");
        int tipoIngresso = sc.nextInt();

        System.out.print("Informe a quantidade: ");
        int quantidade = sc.nextInt();

        String nomeIngresso = "";
        double precoUnitario = 0;
        boolean opcaoValida = true;

        switch (tipoIngresso) {
            case 1:
                nomeIngresso = "Inteira";
                precoUnitario = 32.00;
                break;
            case 2:
                nomeIngresso = "Meia-entrada";
                precoUnitario = 16.00;
                break;
            case 3:
                nomeIngresso = "VIP";
                precoUnitario = 60.00;
                break;
            default:
                opcaoValida = false;
                System.out.println("Tipo de ingresso inválido");
        }

        if (opcaoValida) {
            double valorTotal = quantidade * precoUnitario;
            String descontoTxt = "0%";

            if (quantidade > 4) {
                valorTotal = valorTotal * 0.95; // 5% de desconto
                descontoTxt = "5%";
            }

            System.out.println("Tipo de ingresso: " + nomeIngresso + " Quantidade: " + quantidade + " Desconto aplicado: " + descontoTxt + " Valor final: R$ " + valorTotal);
        }

        sc.close();
    }
}
