package flamingo.aprendendo.listapoo.dominio;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    // Exercício 17
    public boolean temSaldo() {
        return saldo > 0;
    }

    // Exercício 26
    public boolean podeSacar(double valorSaque) {
        return valorSaque <= saldo;
    }

    // Exercício 36
    public void depositar(double valor) {
        saldo += valor;
    }

    // Exercício 37
    public void sacar(double valor) {
        if (podeSacar(valor)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
