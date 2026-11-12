package test;

import dominio.Produto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Produto produto01 = new Produto();
        Produto produto02 = new Produto();

        produto01.setNome("Tv");
        produto01.setQuantidade(400);
        produto01.setPreco(2200);
        produto01.adicionarEstoque(100);

        produto02.setNome("Celular");
        produto02.setQuantidade(100);
        produto02.setPreco(5000);

        produto01.dadosProduto();
        produto02.dadosProduto();
    }
}
