package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Aluno;

public class AlunoTest11 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.nota1 = 8.0;
        aluno.nota2 = 6.0;

        double media = aluno.calcularMedia();

        System.out.println("A média de " + aluno.nome + " é " + media);
    }
}
