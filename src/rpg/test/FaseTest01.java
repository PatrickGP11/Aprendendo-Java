package rpg.test;

import rpg.dominio.Fase;
import rpg.dominio.Monstro;

public class FaseTest01 {
    static void main(String[] args) {
        Fase florestaSombria = new Fase();

        florestaSombria.nome = "Floresta Sombria";
        Monstro goblin = new Monstro();
        goblin.nome = "Goblin";
        goblin.vida = 15;
        goblin.defesa = 1;
        florestaSombria.inimigo = goblin;

        System.out.printf("""
                Fase %s
                
                Monstro encontrado [%s]
                """, florestaSombria.nome, florestaSombria.inimigo.nome);
    }
}
