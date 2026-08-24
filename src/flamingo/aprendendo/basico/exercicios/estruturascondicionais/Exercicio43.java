package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio43 {
    static void main(String[] args) {
        // 43. Sistema de cinema
        {
            int idade = 22;
            boolean temCarteirinhaEstudante = true;
            String resultado;

            if (idade < 12 || temCarteirinhaEstudante) {
                resultado = ("43: Paga meia entrada.");
            } else {
                resultado = ("43: Paga inteira.");
            }
            System.out.println(resultado);
        }
    }
}
