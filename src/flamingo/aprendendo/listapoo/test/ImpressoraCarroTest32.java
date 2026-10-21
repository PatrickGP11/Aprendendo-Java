package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;
import flamingo.aprendendo.listapoo.dominio.ImpressoraCarro;

public class ImpressoraCarroTest32 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2005;
        carro1.velocidadeAtual = 40;

        Carro carro2 = new Carro();
        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2022;
        carro2.velocidadeAtual = 80;

        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro1);
        impressora.imprime(carro2);
    }
}
