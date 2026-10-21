package flamingo.aprendendo.listapoo.dominio;

public class Promocao {

    // Exercício 48 (aqui o preço do objeto É alterado)
    public void aplicarDesconto(Produto produto, double porcentagem) {
        produto.preco = produto.preco - (produto.preco * porcentagem / 100);
    }
}
