package test;

import dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        // ---------- Criando e cadastrando os produtos ----------
        Produto produto01 = new Produto();
        Produto produto02 = new Produto();

        produto01.setNome("Teclado");
        produto01.setPreco(150.00);
        produto01.setQuantidade(5);

        produto02.setNome("Mouse");
        produto02.setPreco(80.00);
        produto02.setQuantidade(10);

        // ---------- Exibindo com os getters ----------
        System.out.println("========== PRODUTO 01 ==========");
        System.out.println("Nome: " + produto01.getNome());
        System.out.println("Preço: R$ " + produto01.getPreco());
        System.out.println("Quantidade: " + produto01.getQuantidade());
        System.out.println("Valor do estoque: R$ " + produto01.calcularValorEstoque());

        System.out.println();
        System.out.println("========== PRODUTO 02 ==========");
        System.out.println("Nome: " + produto02.getNome());
        System.out.println("Preço: R$ " + produto02.getPreco());
        System.out.println("Quantidade: " + produto02.getQuantidade());
        System.out.println("Valor do estoque: R$ " + produto02.calcularValorEstoque());

        // ---------- Testando o encapsulamento ----------
        System.out.println();
        System.out.println("===== TESTANDO VALIDAÇÕES =====");
        produto01.setPreco(-500);
        produto02.setQuantidade(-10);
        produto01.setNome("   ");
        produto01.setNome(null);

        System.out.println("Preço do Teclado continua: R$ " + produto01.getPreco());
        System.out.println("Quantidade do Mouse continua: " + produto02.getQuantidade());

        // Acesso direto: NÃO COMPILA (descomente para ver o erro)
        // produto01.preco = 500;
        // Erro: "preco has private access in Produto"

        // ---------- Desafio extra ----------
        System.out.println();
        System.out.println("===== DESAFIO EXTRA: ADICIONAR ESTOQUE =====");
        System.out.println("Quantidade antes: " + produto01.getQuantidade());
        produto01.adicionarEstoque(3);
        System.out.println("Quantidade depois: " + produto01.getQuantidade());
        produto01.adicionarEstoque(-2); // deve ser rejeitado
        System.out.println("Novo valor do estoque: R$ " + produto01.calcularValorEstoque());
    }
}
