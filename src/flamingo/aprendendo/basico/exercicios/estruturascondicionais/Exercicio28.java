package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio28 {
    static void main(String[] args) {
        // 28. Plano de assinatura
        {
            int plano = 1;
            String resultado;

            if (plano == 1) {
                resultado =("28: Plano Básico - R$ 29,90");
            } else if (plano == 2) {
                resultado =("28: Plano Intermediário - R$ 59,90");
            } else if (plano == 3) {
                resultado =("28: Plano Premium - R$ 99,90");
            } else {
                resultado =("28: Plano inválido");
            }
            System.out.println(resultado);
        }
    }
}
