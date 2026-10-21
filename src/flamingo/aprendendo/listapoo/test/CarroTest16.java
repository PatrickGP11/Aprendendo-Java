package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest16 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2005;

        Carro carro2 = new Carro();
        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2022;

        System.out.println(carro1.modelo + ": " + carro1.verificarIdadeDoCarro());
        System.out.println(carro2.modelo + ": " + carro2.verificarIdadeDoCarro());
    }
}
