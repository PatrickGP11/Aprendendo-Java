package dominio;

import java.util.Locale;

/**
 * Mini Projeto 02 - Sistema Bancário
 *
 * Conceitos principais: ENCAPSULAMENTO e REGRAS DE NEGÓCIO.
 * Os atributos são privados; o mundo externo só mexe neles
 * através de métodos que validam cada operação.
 */
public class ContaBancaria {

    // 1. Atributos privados: ninguém fora desta classe acessa direto
    private String titular;
    private int numeroConta;
    private double saldo; // NÃO existe setSaldo() de propósito!

    // 2. Métodos SET (com validação)

    public void setTitular(String titular) {
        // Ordem importa: testamos null ANTES de chamar trim(),
        // senão teríamos NullPointerException.
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("Erro: o titular não pode ser nulo, vazio ou só espaços.");
            return; // sai sem alterar o atributo
        }
        this.titular = titular; // this.titular = atributo | titular = parâmetro
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta <= 0) {
            System.out.println("Erro: o número da conta deve ser maior que zero.");
            return;
        }
        this.numeroConta = numeroConta;
    }

    // 3. Métodos GET

    public String getTitular() {
        return this.titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // 4. Depósito

    public void depositar(double valor) {
        if (!valorValido(valor)) {
            System.out.println("Erro: depósito inválido. O valor deve ser positivo e finito.");
            return;
        }
        this.saldo += valor;
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Depósito de R$ %,.2f realizado. Saldo atual: R$ %,.2f%n", valor, this.saldo);
    }

    // 5. Saque

    public void sacar(double valor) {
        if (!valorValido(valor)) {
            System.out.println("Erro: saque inválido. O valor deve ser positivo e finito.");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("Erro: saldo insuficiente para o saque.");
            return;
        }
        this.saldo -= valor;
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Saque de R$ %,.2f realizado. Saldo restante: R$ %,.2f%n", valor, this.saldo);
    }

    // 6. Exibir dados

    public void exibirDados() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Saldo: R$ %,.2f%n", this.saldo);
    }

    // 10. Desafio extra: transferência

    public void transferir(ContaBancaria destino, double valor) {
        if (destino == null) {
            System.out.println("Erro: a conta de destino não pode ser nula.");
            return;
        }
        if (!valorValido(valor)) {
            System.out.println("Erro: transferência inválida. O valor deve ser positivo e finito.");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("Erro: saldo insuficiente para a transferência.");
            return;
        }
        // Todas as validações passaram: agora mexemos nos dois saldos.
        // Mexer direto em destino.saldo é permitido: é a MESMA classe,
        // então o private não bloqueia. Isso evita imprimir mensagens
        // de depósito/saque no meio da transferência.
        this.saldo -= valor;
        destino.saldo += valor;
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Transferência de R$ %,.2f de %s para %s realizada.%n",
                valor, this.titular, destino.titular);
    }

    // Método auxiliar privado: evita repetir a mesma validação 3 vezes
    private boolean valorValido(double valor) {
        return valor > 0 && !Double.isNaN(valor) && !Double.isInfinite(valor);
    }
}
