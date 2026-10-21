package flamingo.aprendendo.listapoo.dominio;

public class Banco {

    // Exercício 46
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.podeSacar(valor)) {
            origem.saldo -= valor;
            destino.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
