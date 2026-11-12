package rpg.dominio;

public class Batalha {
    public void atacarComHeroi(Heroi heroi, Monstro monstro) {
        heroi.estaVivo();
        monstro.estaVivo();

        if (!heroi.estaVivo() || !monstro.estaVivo()) {
            System.out.println("Não é possível realizar o ataque");
        }

        int dano = heroi.calcularDano(monstro.defesa);

        monstro.receberDano(dano);

        System.out.println(heroi.nome + " atacou " + monstro.nome);
        System.out.println("Dano causado " + dano);
        System.out.println("Vida restante do monstro " + monstro.vida);
    }
    public void atacarComMonstro( Monstro monstro, Heroi heroi) {
        monstro.estaVivo();
        heroi.estaVivo();

        if (!monstro.estaVivo() || !heroi.estaVivo()) {
            System.out.println("Não é possível realizar o ataque");
        }

        int dano = monstro.calcularDano(heroi.defesa);

        heroi.receberDano(dano);

        System.out.println(monstro.nome + " atacou " + monstro.nome);
        System.out.println("Dano causado " + dano);
        System.out.println("Vida restante do herói " + heroi.vida);
    }
    public void executarTurno(Heroi heroi, Monstro monstro) {
       if (!heroi.estaVivo() || !monstro.estaVivo()) {
           System.out.println("Não é possivel iniciar o turno");
           return;
       }
        System.out.println("======== Novo Turno ==========");

       atacarComHeroi(heroi, monstro);

       if (monstro.estaVivo()) {
           atacarComMonstro(monstro, heroi);
       }
        System.out.println("Vida do herói " + heroi.vida);
        System.out.println("Vida do monstro " + monstro.vida);
    }
}
