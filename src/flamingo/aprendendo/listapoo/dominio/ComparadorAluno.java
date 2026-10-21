package flamingo.aprendendo.listapoo.dominio;

public class ComparadorAluno {

    // Exercício 44
    public Aluno retornarAlunoComMaiorMedia(Aluno aluno1, Aluno aluno2) {
        if (aluno1.calcularMedia() >= aluno2.calcularMedia()) {
            return aluno1;
        }
        return aluno2;
    }
}
