package rpg.dominio;

public class ImpressoraRPG {
    public void imprimirHeroi(Heroi heroi) {
        System.out.printf("""
                Info
                
                Heroi: %s
                Vida: %d
                Ataque: %d
                Defesa: %d
                Nível: %d
                Ouro: %d
                
                """, heroi.nome, heroi.vida, heroi.ataque, heroi.defesa, heroi.nivel, heroi.ouro);
    }
    public void imprimirHeroi(Monstro monstro) {
        System.out.printf("""
                Info
                
                Monstro:
                Vida: %d
                Ataque: %d
                Defesa: %d
                """, monstro.nome, monstro.vida, monstro.ataque, monstro.defesa);

}
}
