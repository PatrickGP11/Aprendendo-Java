package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest40 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Bruno";
        aluno.nota1 = 4.0;
        aluno.nota2 = 6.0;

        System.out.println("Média antiga: " + aluno.calcularMedia());
        aluno.atualizarNotas(8.0, 9.0);
        System.out.println("Média nova: " + aluno.calcularMedia());
    }
}
