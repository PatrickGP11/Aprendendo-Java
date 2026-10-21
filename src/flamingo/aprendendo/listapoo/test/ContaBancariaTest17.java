package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest17 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.saldo = 250.0;

        System.out.println("A conta de " + conta.titular + " tem saldo? " + conta.temSaldo());
    }
}
