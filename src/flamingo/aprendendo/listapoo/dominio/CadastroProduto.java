package flamingo.aprendendo.listapoo.dominio;

public class CadastroProduto {

    // Exercício 43
    public void cadastrar(Produto produto, String nome, double preco, int quantidade) {
        produto.nome = nome;
        produto.preco = preco;
        produto.quantidade = quantidade;
    }
}
