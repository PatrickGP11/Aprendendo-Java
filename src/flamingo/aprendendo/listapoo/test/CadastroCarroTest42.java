package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.CadastroCarro;
import flamingo.aprendendo.listapoo.dominio.Carro;
import flamingo.aprendendo.listapoo.dominio.ImpressoraCarro;

public class CadastroCarroTest42 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Fiat", "Uno", 2005, 40);
        cadastro.cadastrar(carro2, "Toyota", "Corolla", 2022, 80);

        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprime(carro1);
        impressora.imprime(carro2);
    }
}
