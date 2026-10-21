package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest07 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Maria Silva";
        conta.numeroConta = "12345-6";
        conta.saldo = 1500.75;

        System.out.printf("Titular: %s%n", conta.titular);
        System.out.printf("Conta: %s%n", conta.numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", conta.saldo);
    }
}
