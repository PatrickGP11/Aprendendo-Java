package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest22 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Teclado";
        produto.preco = 50.0;

        double novoPreco = produto.aumentarPreco(20);

        System.out.println("Novo preço: " + novoPreco);
    }
}
