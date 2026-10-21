package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;
import flamingo.aprendendo.listapoo.dominio.Promocao;

public class PromocaoTest48 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Teclado";
        produto.preco = 200.0;

        System.out.println("Preço antes: " + produto.preco);

        Promocao promocao = new Promocao();
        promocao.aplicarDesconto(produto, 25);

        System.out.println("Preço depois: " + produto.preco);
    }
}
