package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class ContaBancariaTest37 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.saldo = 100.0;

        conta.sacar(40.0);
        System.out.println("Saldo após sacar 40: " + conta.saldo);

        conta.sacar(300.0);
        System.out.println("Saldo após tentar sacar 300: " + conta.saldo);
    }
}
