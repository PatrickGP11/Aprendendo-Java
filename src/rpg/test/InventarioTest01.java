package rpg.test;

import rpg.dominio.Arma;
import rpg.dominio.Heroi;
import rpg.dominio.Inventario;

public class InventarioTest01 {
    static void main(String[] args) {
        Heroi heroi = new Heroi();
        heroi.nome = "Patrick";
        heroi.vida = 100;
        heroi.ataque = 15;

        Inventario inventario = new Inventario();
        inventario.quantidadePocoes = 3;

        Arma espada = new Arma();
        espada.nome = "Espada Ferro";
        espada.bonusAtaque = 8;
        espada.preco = 150;

        inventario.armaEquipada = espada;

        heroi.inventario = inventario;

        System.out.printf("""
                Heroi %s
                
                [Arma] %s
                [Bônus Ataque] %d+
                [Poções] %d und
                
                """, heroi.nome, heroi.inventario.armaEquipada.nome);
    }
}
