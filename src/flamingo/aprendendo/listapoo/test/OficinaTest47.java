package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;
import flamingo.aprendendo.listapoo.dominio.Oficina;

public class OficinaTest47 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.velocidadeAtual = 40;

        Carro carro2 = new Carro();
        carro2.nome = "Toyota";
        carro2.velocidadeAtual = 90;

        System.out.println("Antes: " + carro1.nome + "=" + carro1.velocidadeAtual + " | " + carro2.nome + "=" + carro2.velocidadeAtual);

        Oficina oficina = new Oficina();
        oficina.trocarVelocidades(carro1, carro2);

        System.out.println("Depois: " + carro1.nome + "=" + carro1.velocidadeAtual + " | " + carro2.nome + "=" + carro2.velocidadeAtual);
    }
}
