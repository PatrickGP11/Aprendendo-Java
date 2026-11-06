package rpg.dominio;

public class CadastroMonstro {
    public void cadastrar(Monstro monstro, String nome, int vida, int ataque, int defesa, int ouro, int experiencia) {
        monstro.nome = nome;
        monstro.vida = vida;
        monstro.ataque = ataque;
        monstro.defesa = defesa;
        monstro.ouroRecompensa = ouro;
        monstro.experienciaRecompensa = experiencia;
    }
}
