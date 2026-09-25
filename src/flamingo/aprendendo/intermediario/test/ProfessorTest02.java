package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Professor;

import java.util.Scanner;

public class ProfessorTest02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();

        System.out.println("Digite o nome do Professor: ");
        String nome = sc.nextLine();
        professor.nome = nome;

        System.out.println("Digite a idade do Professor: ");
        int idade = Integer.parseInt(sc.nextLine());
        // Next Line pega o dado do tipo String, Integer.paseInt do string para Number
        professor.idade = 30;

        System.out.println("Digite a disciplina do Professor: ");
        String disciplina = sc.nextLine();
        professor.disciplina = "ADS";

        System.out.println("Digite o salário do Professor: ");
        String salario = sc.nextLine();
        professor.salario = "R$3.000";


        System.out.println(nome);
        System.out.println(idade);
        System.out.println(disciplina);
        System.out.println(salario);
    }
}
