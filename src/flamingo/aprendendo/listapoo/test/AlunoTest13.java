package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest13 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 9.0;
        aluno1.nota2 = 8.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno";
        aluno2.nota1 = 6.0;
        aluno2.nota2 = 5.0;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carla";
        aluno3.nota1 = 3.0;
        aluno3.nota2 = 4.0;

        System.out.println(aluno1.nome + ": " + aluno1.getSituacao());
        System.out.println(aluno2.nome + ": " + aluno2.getSituacao());
        System.out.println(aluno3.nome + ": " + aluno3.getSituacao());
    }
}
