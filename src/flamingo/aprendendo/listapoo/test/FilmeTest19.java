package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Filme;

public class FilmeTest19 {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "El Bigodon";
        filme.duracaoMinutos = 190;

        System.out.println(filme.titulo + " é longo? " + filme.isFilmeLongo());
    }
}
