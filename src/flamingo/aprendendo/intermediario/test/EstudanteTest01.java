package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do estudante: ");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("Digite a idade do estudante:");
        // Next Line pega o dado do tipo String, Integer.paseInt do string para Number
        int idade = Integer.parseInt(sc.nextLine());
        estudante.idade = idade;

        System.out.println("Digite o rg do estudante: ");
        String rg = sc.nextLine();
        estudante.rg = "00.000.000-0";

        System.out.println("Digite o tel do estudante: ");
        String tel = sc.nextLine();
        estudante.tel = "11980134511";

        System.out.println("Digite o curso do estudante: ");
        String curso = sc.nextLine();
        estudante.curso = "ADS";

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(rg);
        System.out.println(tel);
        System.out.println(curso);
    }
}
