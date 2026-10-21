package flamingo.aprendendo.listapoo.dominio;

public class Funcionario {
    public String nome;
    public double salario;

    // Exercício 28
    public double calcularBonus(double porcentagemBonus) {
        return salario * porcentagemBonus / 100;
    }
}
