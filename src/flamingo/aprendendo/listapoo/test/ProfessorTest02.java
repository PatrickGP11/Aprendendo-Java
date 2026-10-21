package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Professor;

public class ProfessorTest02 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Carlos";
        professor.idade = 45;
        professor.disciplina = "Matemática";
        professor.salario = 5500.50;

        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Disciplina: " + professor.disciplina);
        System.out.println("Salário: R$ " + professor.salario);
    }
}
