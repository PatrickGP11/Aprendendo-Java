package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest35 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.velocidadeAtual = 90;

        Carro carro2 = new Carro();
        carro2.nome = "Toyota";
        carro2.velocidadeAtual = 50;

        carro1.imprimirMulta(60);
        carro2.imprimirMulta(60);
    }
}
