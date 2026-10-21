package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;
import flamingo.aprendendo.listapoo.dominio.ComparadorAluno;

public class ComparadorAlunoTest44 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 9.0;
        aluno1.nota2 = 8.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno";
        aluno2.nota1 = 6.0;
        aluno2.nota2 = 7.0;

        ComparadorAluno comparador = new ComparadorAluno();
        Aluno melhor = comparador.retornarAlunoComMaiorMedia(aluno1, aluno2);

        System.out.println("Aluno com maior média: " + melhor.nome);
    }
}
