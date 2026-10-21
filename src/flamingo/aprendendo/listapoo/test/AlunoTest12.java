package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest12 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Ana";
        aluno.nota1 = 9.0;
        aluno.nota2 = 6.0;

        if (aluno.isAprovado()) {
            System.out.println(aluno.nome + " foi aprovado(a)");
        } else {
            System.out.println(aluno.nome + " foi reprovado(a)");
        }
    }
}
