package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest26 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.saldo = 500.0;

        System.out.println("Pode sacar 200? " + conta.podeSacar(200));
        System.out.println("Pode sacar 500? " + conta.podeSacar(500));
        System.out.println("Pode sacar 800? " + conta.podeSacar(800));
    }
}
