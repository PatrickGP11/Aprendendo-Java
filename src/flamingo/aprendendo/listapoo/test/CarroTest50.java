package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.CadastroCarro;
import flamingo.aprendendo.listapoo.dominio.Carro;
import flamingo.aprendendo.listapoo.dominio.ImpressoraCarro;

public class CarroTest50 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(carro1, "Fiat", "Uno", 2005, 90);
        cadastro.cadastrar(carro2, "Toyota", "Corolla", 2022, 50);

        int limiteDaVia = 60;

        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprimir(carro1, limiteDaVia);
        System.out.println();
        impressora.imprimir(carro2, limiteDaVia);
    }
}
