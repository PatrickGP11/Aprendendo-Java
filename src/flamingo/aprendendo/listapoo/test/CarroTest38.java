package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest38 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fiat";
        carro.velocidadeAtual = 40;

        System.out.println("Velocidade antes: " + carro.velocidadeAtual);
        carro.acelerar(30);
        System.out.println("Velocidade depois: " + carro.velocidadeAtual);
    }
}
