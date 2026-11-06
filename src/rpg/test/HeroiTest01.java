package rpg.test;

import rpg.dominio.Heroi;

public class HeroiTest01 {
    static void main(String[] args) {
        Heroi arthur = new Heroi();
        Heroi luna = new Heroi();

        arthur.nome = "Arthur";
        arthur.vida = 100;
        arthur.ataque = 15;
        arthur.defesa = 5;

        luna.nome = "Luna";
        luna.vida = 80;
        luna.ataque = 20;
        luna.defesa = 3;

        System.out.printf("""
                Heroi %s
                
                [Vida] = %d
                [Ataque] = %d
                [Defesa] = %d
                """, arthur.nome, arthur.vida, arthur.ataque, arthur.defesa);
        System.out.println("-----------------------------");
        System.out.printf("""
                Heroi %s
                
                [Vida] = %d
                [Ataque] = %d
                [Defesa] = %d
                """, luna.nome, luna.vida, luna.ataque, luna.defesa);
    }
}
