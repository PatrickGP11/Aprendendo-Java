package flamingo.aprendendo.listapoo.dominio;

public class Filme {
    public String titulo;
    public String genero;
    public int duracaoMinutos;
    public String classificacaoIndicativa;

    // Exercício 19
    public boolean isFilmeLongo() {
        return duracaoMinutos > 120;
    }
}
