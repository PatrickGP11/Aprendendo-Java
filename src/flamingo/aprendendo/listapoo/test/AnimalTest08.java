package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Animal;

public class AnimalTest08 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nome = "Rex";
        animal1.especie = "Cachorro";
        animal1.idade = 5;

        Animal animal2 = new Animal();
        animal2.nome = "Mimi";
        animal2.especie = "Gato";
        animal2.idade = 3;

        System.out.printf("%s é um(a) %s de %d anos%n", animal1.nome, animal1.especie, animal1.idade);
        System.out.printf("%s é um(a) %s de %d anos%n", animal2.nome, animal2.especie, animal2.idade);
    }
}
