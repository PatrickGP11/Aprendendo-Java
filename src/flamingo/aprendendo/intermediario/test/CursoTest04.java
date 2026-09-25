package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Curso;

import java.util.Scanner;

public class CursoTest04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Digite o nome do curso: ");
        String nome = sc.nextLine();
        curso.nome = "ADS";

        System.out.println("Digite quantos anos este curso terá: ");
        int duracaoAnos = 2;
        // Next Line pega o dado do tipo String, Integer.paseInt do string para Number
        curso.duracaoAnos = Integer.parseInt(sc.nextLine());

        System.out.println("Digite a mensalidade deste curso: ");
        double mensalidade = 459.90;
        // Double.parseDouble() converte o texto (String) lido pelo sc.nextLine() num número double
        // Usar o sc.nextLine() garante que a tecla Enter é consumida do buffer do Scanner.
        curso.mensalidade = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o modelo deste curso: ");
        String modelo = sc.nextLine();
        curso.modelo = "Presencial";

        System.out.println("Digite o turno deste curso: ");
        String turno = sc.nextLine();
        curso.turno = "Noturno";

        System.out.println(nome);
        System.out.println(duracaoAnos);
        System.out.println(mensalidade);
        System.out.println(modelo);
        System.out.println(turno);
    }
}
