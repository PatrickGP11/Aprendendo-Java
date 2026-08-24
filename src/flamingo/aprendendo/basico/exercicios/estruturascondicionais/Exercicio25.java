package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio25 {
    static void main(String[] args) {
        // 25. Nível do jogador
        {
            int xp = 5200;
            String resultado;

            if (xp < 1000) {
                resultado = ("25: Iniciante");
            } else if (xp <= 4999) {
                resultado = ("25: Intermediário");
            } else if (xp <= 9999) {
                resultado = ("25: Avançado");
            } else {
                resultado = ("25: Lendário");
            }
            System.out.println(resultado);
        }
    }
}
