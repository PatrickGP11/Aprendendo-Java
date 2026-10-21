package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest30 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse";
        produto.quantidade = 3;

        System.out.println("Estoque baixo (mínimo 5)? " + produto.estoqueBaixo(5));
    }
}
