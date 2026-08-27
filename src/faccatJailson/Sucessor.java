package faccatJailson;

import java.util.Scanner;

public class Sucessor {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Sucessor");
        System.out.println("Digite um valor para saber o seu sucessor: ");
        int numero = sc.nextInt();
        int sucessor = numero + 1;

        System.out.println("O número sucessor do valor digitado é: " + sucessor);

        sc.close();
    }
}
