package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest34 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Bruno";
        aluno.nota1 = 6.0;
        aluno.nota2 = 5.0;

        aluno.imprimirSituacao();
    }
}
