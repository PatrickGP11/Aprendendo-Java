package test;

import dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {

        // ---------- Criando e cadastrando as contas ----------
        ContaBancaria conta01 = new ContaBancaria();
        ContaBancaria conta02 = new ContaBancaria();

        conta01.setTitular("Rafael");
        conta01.setNumeroConta(1001);

        conta02.setTitular("Ana");
        conta02.setNumeroConta(1002);

        // ---------- Operações válidas ----------
        System.out.println("===== OPERAÇÕES VÁLIDAS =====");
        conta01.depositar(1000.00);
        conta01.sacar(350.00);
        conta02.depositar(500.00);

        System.out.println();
        System.out.println("========== CONTA 01 ==========");
        conta01.exibirDados();
        System.out.println();
        System.out.println("========== CONTA 02 ==========");
        conta02.exibirDados();

        // ---------- Testando as validações ----------
        System.out.println();
        System.out.println("===== TESTANDO VALIDAÇÕES (todas devem ser rejeitadas) =====");
        conta01.depositar(-100);
        conta01.sacar(5000);
        conta02.depositar(0);
        conta02.sacar(-50);
        conta01.depositar(Double.NaN);
        conta01.sacar(Double.POSITIVE_INFINITY);
        conta01.setTitular("   ");
        conta01.setTitular(null);
        conta01.setNumeroConta(0);

        System.out.println();
        System.out.println("Saldos continuam iguais? Conta 01: R$ " + conta01.getSaldo()
                + " | Conta 02: R$ " + conta02.getSaldo());

        // Tentativa de acesso direto: NÃO COMPILA (descomente para ver o erro)
        // conta01.saldo = 999999;
        // Erro: "saldo has private access in ContaBancaria"

        // ---------- Desafio extra: transferência ----------
        System.out.println();
        System.out.println("===== DESAFIO EXTRA: TRANSFERÊNCIA =====");
        conta01.transferir(conta02, 150.00);
        conta01.transferir(null, 10);        // destino nulo
        conta01.transferir(conta02, 99999);  // saldo insuficiente
        conta01.transferir(conta02, -5);     // valor inválido

        System.out.println();
        System.out.println("========== CONTA 01 ==========");
        conta01.exibirDados();
        System.out.println();
        System.out.println("========== CONTA 02 ==========");
        conta02.exibirDados();
    }
}
