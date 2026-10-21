package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Filme;

public class FilmeTest09 {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.titulo = "El Bigodon";
        filme.genero = "Terror";
        filme.duracaoMinutos = 190;
        filme.classificacaoIndicativa = "A18";

        System.out.printf("""
                Filme %s do genero %s tem %d minutos na classificação indicativa %s
                """, filme.titulo, filme.genero, filme.duracaoMinutos, filme.classificacaoIndicativa);
    }
}
