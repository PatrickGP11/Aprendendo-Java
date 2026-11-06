package rpg.test;

import rpg.dominio.Arma;

public class ArmaTest01 {
    static void main(String[] args) {
        Arma espadaMadeira = new Arma();
        Arma espadaFerro = new Arma();

        espadaMadeira.nome = "Espada de Madeira";
        espadaMadeira.bonusAtaque = 2;
        espadaMadeira.preco = 50;

        espadaFerro.nome = "Espada de Ferro";
        espadaFerro.bonusAtaque = 8;
        espadaFerro.preco = 150;

        System.out.printf("""
                %s
                
                [Vida] = %d
                [Bonus Ataque] = %d
                [Preco] = %.2f
                """, espadaMadeira.nome, espadaMadeira.bonusAtaque, espadaMadeira.preco);
        System.out.println("---------------------");
        System.out.printf("""
                %s
                
                [Vida] = %d
                [Bonus Ataque] = %d
                [Preco] = %.2f
                """, espadaFerro.nome, espadaFerro.bonusAtaque, espadaFerro.preco);
    }
}