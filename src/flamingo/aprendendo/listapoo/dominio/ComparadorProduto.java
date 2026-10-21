package flamingo.aprendendo.listapoo.dominio;

public class ComparadorProduto {

    // Exercício 45
    public Produto retornarProdutoMaisCaro(Produto produto1, Produto produto2) {
        if (produto1.preco >= produto2.preco) {
            return produto1;
        }
        return produto2;
    }
}
