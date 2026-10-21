package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.ImpressoraProduto;
import flamingo.aprendendo.listapoo.dominio.Produto;

public class ImpressoraProdutoTest33 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Mouse";
        produto1.preco = 50.0;
        produto1.quantidade = 20;

        Produto produto2 = new Produto();
        produto2.nome = "Teclado";
        produto2.preco = 120.0;
        produto2.quantidade = 10;

        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto1);
        impressora.imprime(produto2);
    }
}
