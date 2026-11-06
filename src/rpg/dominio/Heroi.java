package rpg.dominio;

public class Heroi {
    public String nome;
    public int vida;
    public int vidaMaxima;
    public int ataque;
    public int defesa;
    public int nivel;
    public int experiencia;
    public int ouro;
    public Inventario inventario;

    public boolean estaVivo() {
        return vida > 0;
    }

    public int calcularAtaqueTotal() {
        if (inventario == null || inventario.armaEquipada == null) {
            return ataque;
        }
        return ataque + inventario.armaEquipada.bonusAtaque;
    }

    public int calcularDano(int defesaInimigo) {
        int dano = ataque - defesaInimigo;
        if (dano < 1){
            return 1;
        }
        return dano;
    }
    public void receberDano (int dano) {
        if (dano < 0){
            return;
        }
        if (vida < 0) {
            return;
        }
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }
    public void curar(int pontosDeCura) {
        if (pontosDeCura < 0) {
            return;
        }
            vida += pontosDeCura;

        if (vida > vidaMaxima) {
            vida = vidaMaxima;
        }
    }
    public String gerarResumo() {
        return """
                
                
                """;
    }
}

