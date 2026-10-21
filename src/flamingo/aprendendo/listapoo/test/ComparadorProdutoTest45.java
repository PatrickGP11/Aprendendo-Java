package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.ComparadorProduto;
import flamingo.aprendendo.listapoo.dominio.Produto;

public class ComparadorProdutoTest45 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Mouse";
        produto1.preco = 50.0;

        Produto produto2 = new Produto();
        produto2.nome = "Teclado";
        produto2.preco = 120.0;

        ComparadorProduto comparador = new ComparadorProduto();
        Produto maisCaro = comparador.retornarProdutoMaisCaro(produto1, produto2);

        System.out.println("Produto mais caro: " + maisCaro.nome);
    }
}
