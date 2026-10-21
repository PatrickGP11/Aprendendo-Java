package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Celular;

public class CelularTest06 {
    public static void main(String[] args) {
        Celular celular = new Celular();

        celular.marca = "Samsung";
        celular.modelo = "S26";
        celular.armazenamento = 256;
        celular.preco = 4000;

        System.out.printf("Celular %s %s com %dGB custa R$ %.1f%n", celular.marca, celular.modelo, celular.armazenamento, celular.preco);
    }
}
