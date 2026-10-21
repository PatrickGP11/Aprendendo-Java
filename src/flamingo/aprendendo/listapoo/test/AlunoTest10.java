package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest10 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "João";
        aluno.nota1 = 8.0;
        aluno.nota2 = 6.5;

        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
    }
}
