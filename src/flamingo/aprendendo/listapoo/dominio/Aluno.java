package flamingo.aprendendo.listapoo.dominio;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    // Exercício 11
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Exercício 12
    public boolean isAprovado() {
        return calcularMedia() >= 7;
    }

    // Exercício 13
    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        }
        return "Reprovado";
    }

    // Exercício 34
    public void imprimirSituacao() {
        System.out.println(getSituacao());
    }

    // Exercício 40
    public void atualizarNotas(double novaNota1, double novaNota2) {
        nota1 = novaNota1;
        nota2 = novaNota2;
    }
}
