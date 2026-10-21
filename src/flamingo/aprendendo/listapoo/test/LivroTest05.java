package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Livro;

public class LivroTest05 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;
        livro1.preco = 39.90;

        Livro livro2 = new Livro();
        livro2.titulo = "O Senhor dos Anéis";
        livro2.autor = "J.R.R. Tolkien";
        livro2.numeroPaginas = 1200;
        livro2.preco = 89.90;

        System.out.printf("Livro: %s | Autor: %s | Páginas: %d | Preço: R$ %.2f%n",
                livro1.titulo, livro1.autor, livro1.numeroPaginas, livro1.preco);
        System.out.printf("Livro: %s | Autor: %s | Páginas: %d | Preço: R$ %.2f%n",
                livro2.titulo, livro2.autor, livro2.numeroPaginas, livro2.preco);
    }
}
