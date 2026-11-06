package rpg.test;

import rpg.dominio.Monstro;

public class MonstroTest01 {
    static void main(String[] args) {
        Monstro goblin = new Monstro();
        Monstro esqueleto = new Monstro();
        Monstro guardiaoSombrio = new Monstro();

        goblin.nome = "Goblin";
        goblin.vida = 30;
        goblin.ataque = 6;
        goblin.defesa = 1;
        String goblinEstaVivo = goblin.estaVivo() ? "Vivo" : "Morto";

        esqueleto.nome = "Esqueleto";
        esqueleto.vida = 0;
        esqueleto.ataque = 9;
        esqueleto.defesa = 2;
        String esqueletoEstaVivo = goblin.estaVivo() ? "Morto" : "Vivo";

        guardiaoSombrio.nome = "Guardião Sombrio";
        guardiaoSombrio.vida = 75;
        guardiaoSombrio.ataque = 12;
        guardiaoSombrio.defesa = 3;

        System.out.printf("""
                Monstro %s
                
                [Vida] = %d
                [Ataque] = %d
                [Defesa] = %d
                [Status] = %s
                """, goblin.nome, goblin.vida, goblin.ataque, goblin.defesa, goblinEstaVivo);
        System.out.println("-----------------------------");
        System.out.printf("""
                Monstro %s
                
                [Vida] = %d
                [Ataque] = %d
                [Defesa] = %d
                [Status] = %s
                """, esqueleto.nome, esqueleto.vida, esqueleto.ataque, esqueleto.defesa, esqueletoEstaVivo);
        System.out.println("-----------------------------");
        System.out.printf("""
                Monstro %s
                
                [Vida] = %d
                [Ataque] = %d
                [Defesa] = %d
                """, guardiaoSombrio.nome, guardiaoSombrio.vida, guardiaoSombrio.ataque, guardiaoSombrio.defesa);
    }
}
