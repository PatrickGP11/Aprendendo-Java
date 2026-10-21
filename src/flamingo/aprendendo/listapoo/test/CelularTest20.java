package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Celular;

public class CelularTest20 {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "S26";
        celular1.preco = 4000;

        Celular celular2 = new Celular();
        celular2.marca = "Motorola";
        celular2.modelo = "G15";
        celular2.preco = 1200;

        System.out.println(celular1.modelo + " é premium? " + celular1.isPremium());
        System.out.println(celular2.modelo + " é premium? " + celular2.isPremium());
    }
}
