package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest23 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.velocidadeAtual = 90;

        Carro carro2 = new Carro();
        carro2.nome = "Toyota";
        carro2.velocidadeAtual = 50;

        int limiteDaVia = 60;

        System.out.println(carro1.nome + " multado? " + carro1.isMultado(limiteDaVia));
        System.out.println(carro2.nome + " multado? " + carro2.isMultado(limiteDaVia));
    }
}
