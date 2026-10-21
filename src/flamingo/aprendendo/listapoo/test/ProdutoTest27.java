package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Produto;

public class ProdutoTest27 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Fone de ouvido";
        produto.preco = 120.0;

        double valorFinal = produto.calcularFrete(15.0);

        System.out.println("Valor final com frete: R$ " + valorFinal);
    }
}
