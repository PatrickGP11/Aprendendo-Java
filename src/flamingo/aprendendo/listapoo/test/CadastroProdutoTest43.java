package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.CadastroProduto;
import flamingo.aprendendo.listapoo.dominio.ImpressoraProduto;
import flamingo.aprendendo.listapoo.dominio.Produto;

public class CadastroProdutoTest43 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        CadastroProduto cadastro = new CadastroProduto();
        cadastro.cadastrar(produto1, "Mouse", 50.0, 20);
        cadastro.cadastrar(produto2, "Teclado", 120.0, 10);

        ImpressoraProduto impressora = new ImpressoraProduto();
        impressora.imprime(produto1);
        impressora.imprime(produto2);
    }
}
