package rpg.dominio;

public class Monstro {
    public String nome;
    public int vida;
    public int ataque;
    public int defesa;
    public int ouroRecompensa;
    public int experienciaRecompensa;
    private int dano;

    public boolean estaVivo() {
        return vida > 0;
    }
    public int calcularDano(int defesaHeroi) {
        int dano = ataque - defesaHeroi;
        if (dano < 1){
            return 1;
        }
        return dano;
}
    public void receberDano(int dano) {
        if (this.dano < 0) {
            return;
        }
        vida -= this.dano;
        if (vida < 0) {
            vida = 0;
        }
}
}


