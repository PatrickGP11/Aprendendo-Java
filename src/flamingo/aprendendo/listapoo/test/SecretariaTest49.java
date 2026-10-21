package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;
import flamingo.aprendendo.listapoo.dominio.Secretaria;

public class SecretariaTest49 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Bruno";
        aluno.nota1 = 3.0;
        aluno.nota2 = 4.0;

        System.out.println("Situação antes: " + aluno.getSituacao());

        Secretaria secretaria = new Secretaria();
        secretaria.atualizarAluno(aluno, 8.0, 9.0);

        System.out.println("Situação depois: " + aluno.getSituacao());
    }
}
