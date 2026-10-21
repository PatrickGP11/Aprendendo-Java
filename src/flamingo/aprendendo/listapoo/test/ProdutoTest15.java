package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest15 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3500.0;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta";
        produto2.preco = 3.5;

        System.out.println(produto1.nome + ": " + produto1.verificarCategoria());
        System.out.println(produto2.nome + ": " + produto2.verificarCategoria());
    }
}
