package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest04 {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3500.0;
        produto.quantidade = 10;

        System.out.printf("Produto: %s%n", produto.nome);
        System.out.printf("Preço: R$ %.2f%n", produto.preco);
        System.out.printf("Quantidade: %d%n", produto.quantidade);
    }
}
