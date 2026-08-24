package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio21 {
    static void main(String[] args) {
        // 21. Classificação por idade
        {
            int idade = 14;
            String resultado;

            if (idade < 12) {
                resultado = ("21: Criança");
            } else if (idade <= 17) {
                resultado = ("21: Adolescente");
            } else if (idade <= 59) {
                resultado = ("21: Adulto");
            } else {
                resultado = ("21: Idoso");
            }
            System.out.println(resultado);
        }
    }
}
