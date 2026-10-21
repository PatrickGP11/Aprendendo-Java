package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Banco;
import flamingo.aprendendo.listapoo.dominio.ContaBancaria;

public class BancoTest46 {
    public static void main(String[] args) {
        ContaBancaria origem = new ContaBancaria();
        origem.titular = "Maria";
        origem.saldo = 1000.0;

        ContaBancaria destino = new ContaBancaria();
        destino.titular = "João";
        destino.saldo = 200.0;

        Banco banco = new Banco();
        banco.transferir(origem, destino, 300.0);

        System.out.println("Saldo de " + origem.titular + ": " + origem.saldo);
        System.out.println("Saldo de " + destino.titular + ": " + destino.saldo);
    }
}
