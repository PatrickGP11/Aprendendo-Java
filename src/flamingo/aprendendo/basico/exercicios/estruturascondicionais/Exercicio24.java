package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio24 {
    static void main(String[] args) {
        // 24. Temperatura do dia
        {
            double temperatura = 36.0;
            String resultado;

            if (temperatura < 15) {
                resultado = ("24: Frio");
            } else if (temperatura <= 25) {
                resultado = ("24: Agradável");
            } else if (temperatura <= 35) {
                resultado = ("24: Quente");
            } else {
                resultado = ("24: Muito quente");
            }
            System.out.println(resultado);
        }
    }
}
