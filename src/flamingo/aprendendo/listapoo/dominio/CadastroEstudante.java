package flamingo.aprendendo.listapoo.dominio;

public class CadastroEstudante {

    // Exercício 41
    public void cadastrar(Estudante estudante, String nome, int idade, char sexo) {
        estudante.nome = nome;
        estudante.idade = idade;
        estudante.sexo = sexo;
    }
}
