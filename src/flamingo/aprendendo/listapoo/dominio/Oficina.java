package flamingo.aprendendo.listapoo.dominio;

public class Oficina {

    // Exercício 47
    public void trocarVelocidades(Carro carro1, Carro carro2) {
        double auxiliar = carro1.velocidadeAtual;
        carro1.velocidadeAtual = carro2.velocidadeAtual;
        carro2.velocidadeAtual = auxiliar;
    }
}
