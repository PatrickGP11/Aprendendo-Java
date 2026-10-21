package flamingo.aprendendo.listapoo.dominio;

public class ImpressoraProduto {

    // Exercício 33
    public void imprime(Produto produto) {
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Valor total: " + produto.calcularValorTotal());
    }
}
