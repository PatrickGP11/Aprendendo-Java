package flamingo.aprendendo.listapoo.dominio;

public class Celular {
    public String marca;
    public String modelo;
    public int armazenamento;
    public double preco;

    // Exercício 20
    public boolean isPremium() {
        return preco >= 4000;
    }
}
