package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest39 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fiat";
        carro.velocidadeAtual = 20;

        carro.frear(50);

        System.out.println("Velocidade final: " + carro.velocidadeAtual);
    }
}
