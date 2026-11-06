package rpg.test;

import rpg.dominio.Batalha;
import rpg.dominio.Heroi;
import rpg.dominio.Monstro;

public class BatalhaTest01 {
    static void main(String[] args) {
        Heroi heroi = new Heroi();

        heroi.nome = "Bigas";
        heroi.vida = 100;
        heroi.ataque = 15;
        heroi.defesa = 5;

        Monstro monstro = new Monstro();

        monstro.nome = "Goblin";
        monstro.vida = 30;
        monstro.ataque = 6;
        monstro.defesa = 1;

        Batalha batalha = new Batalha();

        while (heroi.estaVivo() && monstro.estaVivo()) {
            if (heroi.estaVivo()) {
                System.out.println("Herói venceu a batalha");
            }else {
                System.out.println("Herói foi derrotado");
            }
        }
    }
}
