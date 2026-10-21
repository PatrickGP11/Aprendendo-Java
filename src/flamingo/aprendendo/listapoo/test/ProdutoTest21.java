package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest21 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Teclado";
        produto.preco = 100.0;

        double precoComDesconto = produto.aplicarDesconto(10);

        System.out.println("Preço original: " + produto.preco);
        System.out.println("Preço com desconto: " + precoComDesconto);
    }
}
