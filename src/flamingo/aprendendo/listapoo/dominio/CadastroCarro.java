package flamingo.aprendendo.listapoo.dominio;

public class CadastroCarro {

    // Exercícios 42 e 50
    public void cadastrar(Carro carro, String nome, String modelo, int ano, double velocidadeAtual) {
        carro.nome = nome;
        carro.modelo = modelo;
        carro.ano = ano;
        carro.velocidadeAtual = velocidadeAtual;
    }
}
