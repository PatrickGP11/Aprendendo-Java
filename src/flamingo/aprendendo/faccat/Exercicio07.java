package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio07 {
    // 7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
    //dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

    static void main(String[] args) {
        byte dias,meses,idade;
        int diasDeVida;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = sc.nextByte();

        System.out.println("Quantos meses adicionais?: ");
        meses = sc.nextByte();

        System.out.println("Quantos dias adicionais?: ");
        dias = sc.nextByte();

        diasDeVida = (idade * 365) + (meses * 30) + dias;

        System.out.printf("Você tem %d = %d dias de vida.", idade,diasDeVida);

        sc.close();
    }
}
