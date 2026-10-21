package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest03 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2008;

        carro2.nome = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2022;

        System.out.println("Carro 1: " + carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
