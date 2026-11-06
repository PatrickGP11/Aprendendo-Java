package rpg.test;

import rpg.dominio.Heroi;
import rpg.dominio.Jogo;
import rpg.dominio.Monstro;

public class JogoTest01 {
    static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.titulo = "A Jornada de Eldoria!";

        Heroi heroi01 = new Heroi();
        heroi01.nome = "Patrick";
        heroi01.vida = 15;

        Monstro monstro01 = new Monstro();
        monstro01.nome = "Goblin";
        monstro01.vida = 0;

        String estaVivo = heroi01.estaVivo() ? "Vivo" : "Morto";

        System.out.printf("""
                Bem-vindo ao RPG: %s
                
                Jogador [%s] - [Status] %s
                Vida [%d]
                """, jogo.titulo, heroi01.nome, estaVivo, heroi01.vida);
    }
}
