package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio22 {
    static void main(String[] args) {
        // 22. Conceito da nota
        {
            double nota = 8.5;
            String avaliacao;

            if (nota >= 9) {
                avaliacao = "22: Excelente";
            } else if (nota >= 7) {
                avaliacao = "22: Bom";
            } else if (nota >= 5) {
                avaliacao = "22: Ruim";
            } else {
                avaliacao = "22: Recuperação";
            }
            System.out.println(avaliacao);
        }
    }
}
