package flamingo.aprendendo.listapoo.dominio;

public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;
    public double preco;

    // Exercício 18
    public String verificarTamanho() {
        if (numeroPaginas > 300) {
            return "Livro grande";
        }
        return "Livro pequeno";
    }
}
