package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturasCondicionaisPt04 {
    static void main(String[] args) {
        // Switch Case (Escolha Caso)
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número de 1 a 7 para o dia da semana");
        byte diaSemana = sc.nextByte();
        String resultado;

        switch (diaSemana) {
            case 1:
                resultado = "Domingo";
                break;
            case 2:
                resultado = "Segunda-feira";
                break;
            case 3:
                resultado = "Terça-feira";
                break;
            case 4:
                resultado = "Quarta-feira";
                break;
            case 5:
                resultado = "Quinta-feira";
                break;
            case 6:
                resultado = "Sexta-feira";
                break;
            case 7:
                resultado = "Sábado";
                break;
            default:
                resultado = "Dia inválido!";
                break;
        }
        System.out.println(resultado);
        sc.close();
    }
}
