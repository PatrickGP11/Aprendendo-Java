package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Disciplina;

import java.util.Scanner;

public class DisciplinaTest03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();

        System.out.println("Digite o nome da Disciplina: ");
        String nome = sc.nextLine();
        disciplina.nome = "ADS";

        System.out.println("Digite a carga horária desta Disciplina: ");
        double cargaHoraria = Double.parseDouble(sc.nextLine())  ;
        // Double.parseDouble() converte o texto (String) lido pelo sc.nextLine() num número double
        // Usar o sc.nextLine() garante que a tecla Enter é consumida do buffer do Scanner.
        disciplina.cargaHoraria = 1.600;

        System.out.println("Digite o nome do professor que dará a Disciplina: ");
        String nomeProfessor = sc.nextLine();
        disciplina.nomeProfessor = nomeProfessor;

        System.out.println("Digite quantos semestres esta Disciplina tem: ");
        int semestre = Integer.parseInt(sc.nextLine());
        // Next Line pega o dado do tipo String, Integer.paseInt do string para Number
        disciplina.semestre = 4;

        System.out.println(nome);
        System.out.println(cargaHoraria);
        System.out.println(nomeProfessor);
        System.out.println(semestre);
    }
}
