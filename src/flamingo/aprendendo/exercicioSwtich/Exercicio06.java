package flamingo.aprendendo.exercicioSwtich;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a operação (1-Soma, 2-Subtração, 3-Multiplicação, 4-Divisão): ");
        int operacao = sc.nextInt();

        System.out.print("Informe o primeiro número: ");
        double numero01 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero02 = sc.nextDouble();

        String nomeOperacao = "";
        double resultado = 0;
        boolean operacaoValida = true;
        boolean erroDivisaoZero = false;

        switch (operacao) {
            case 1:
                nomeOperacao = "Soma";
                resultado = numero01 + numero02;
                break;
            case 2:
                nomeOperacao = "Subtração";
                resultado = numero01 - numero02;
                break;
            case 3:
                nomeOperacao = "Multiplicação";
                resultado = numero01 * numero02;
                break;
            case 4:
                nomeOperacao = "Divisão";
                if (numero02 == 0) {
                    erroDivisaoZero = true;
                } else {
                    resultado = numero01 / numero02;
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Operação inválida");
        }

        if (operacaoValida) {
            if (erroDivisaoZero) {
                System.out.println("Não é possível dividir por zero");
            } else {
                System.out.println("Operação escolhida: " + nomeOperacao + " Resultado: " + resultado);
            }
        }

        sc.close();
    }
}
