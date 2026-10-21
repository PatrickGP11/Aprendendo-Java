package flamingo.aprendendo.listapoo.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;
    public double velocidadeAtual; // adicionado no exercício 23

    // Exercício 16
    public String verificarIdadeDoCarro() {
        if (ano < 2010) {
            return "Carro antigo";
        }
        return "Carro novo";
    }

    // Exercício 23
    public boolean isMultado(int limiteDaVia) {
        return velocidadeAtual > limiteDaVia;
    }

    // Exercício 24
    public String gerarMensagemMulta(int limiteDaVia) {
        if (isMultado(limiteDaVia)) {
            return "Passou do limite da via";
        }
        return "Não passou do limite da via";
    }

    // Exercício 35
    public void imprimirMulta(int limiteDaVia) {
        if (isMultado(limiteDaVia)) {
            System.out.println("Você tem uma multa para pagar");
        } else {
            System.out.println("Zero multas");
        }
    }

    // Exercício 38
    public void acelerar(double valor) {
        velocidadeAtual += valor;
    }

    // Exercício 39
    public void frear(double valor) {
        velocidadeAtual -= valor;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }
}
