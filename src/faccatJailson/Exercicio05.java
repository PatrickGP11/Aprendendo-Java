package faccatJailson;

import java.util.Scanner;

public class Exercicio05 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Antecessor");
        System.out.println("Digite um valor para saber o seu antecessor: ");
        int numero = sc.nextInt();
        int antecessor = numero - 1;

        System.out.println("O número antecessor do valor digitado é: " + antecessor);
        sc.close();
    }
}
