package flamingo.aprendendo.listapoo.dominio;

public class ImpressoraCarro {

    // Exercício 32
    public void imprime(Carro carro) {
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade atual: " + carro.velocidadeAtual);
    }

    // Exercício 50
    public void imprimir(Carro carro, int limiteDaVia) {
        imprime(carro);
        System.out.println("Multado: " + carro.isMultado(limiteDaVia));
        System.out.println(carro.gerarMensagemMulta(limiteDaVia));
    }
}
