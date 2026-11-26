package dominio;

/**
 * Mini Projeto - Sistema de Cadastro de Produtos
 *
 * Conceitos principais: ENCAPSULAMENTO, getters/setters e this.
 * Os atributos são privados; o acesso é feito por métodos públicos
 * que validam os dados antes de guardá-los.
 */
public class Produto {

    // 1. Atributos privados
    private String nome;
    private double preco;
    private int quantidade;

    // 2. Métodos SET (com validação)

    public void setNome(String nome) {
        // Testamos null ANTES de trim(): se fosse o contrário,
        // setNome(null) lançaria NullPointerException.
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: o nome não pode ser nulo, vazio ou só espaços.");
            return; // sai sem alterar o atributo
        }
        this.nome = nome; // this.nome = atributo | nome = parâmetro
    }

    public void setPreco(double preco) {
        // NaN < 0 é false, então "preco < 0" sozinho deixaria NaN passar.
        // Por isso checamos NaN e infinito explicitamente.
        if (preco < 0 || Double.isNaN(preco) || Double.isInfinite(preco)) {
            System.out.println("Erro: o preço não pode ser negativo (nem NaN/infinito).");
            return;
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Erro: a quantidade não pode ser negativa.");
            return;
        }
        this.quantidade = quantidade;
    }

    // 3. Métodos GET

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    // 4. Método de cálculo

    public double calcularValorEstoque() {
        // int * double: o int é promovido a double automaticamente
        return this.preco * this.quantidade;
    }

    // Desafio extra

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade a adicionar deve ser positiva.");
            return;
        }
        this.quantidade += quantidade;
    }
}
