package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Livro;

public class LivroTest18 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.numeroPaginas = 256;

        Livro livro2 = new Livro();
        livro2.titulo = "O Senhor dos Anéis";
        livro2.numeroPaginas = 1200;

        System.out.println(livro1.titulo + ": " + livro1.verificarTamanho());
        System.out.println(livro2.titulo + ": " + livro2.verificarTamanho());
    }
}
