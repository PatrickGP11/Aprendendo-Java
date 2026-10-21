package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest14 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse";
        produto.preco = 50.0;
        produto.quantidade = 20;

        System.out.printf("Valor total em estoque de %s: R$ %.2f%n", produto.nome, produto.calcularValorTotal());
    }
}
