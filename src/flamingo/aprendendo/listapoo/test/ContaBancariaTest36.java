package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest36 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.saldo = 100.0;

        System.out.println("Saldo antes: " + conta.saldo);
        conta.depositar(250.0);
        System.out.println("Saldo depois: " + conta.saldo);
    }
}
