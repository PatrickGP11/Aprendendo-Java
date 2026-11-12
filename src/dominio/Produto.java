package dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido");
            return;
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido!");
            return;
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida!");
            return;
        }
        this.quantidade = quantidade;
    }

    // Passo 03

    public String getNome() {
      return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    // Passo 4

    public double calcularValorEstoque() {
        return getPreco() * getQuantidade();
        }

        // Passo extra do extra
    public void dadosProduto() {
        System.out.printf("""
                Produto %s
                Quantidade: %d
                Preço: R$ %.2f
                Valor total estoque: R$ %.2f
                
                """, this.nome, this.quantidade, this.preco, calcularValorEstoque());
    }
    // Passo Extra
    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            return;
        }
        this.quantidade += quantidade;
    }
}
