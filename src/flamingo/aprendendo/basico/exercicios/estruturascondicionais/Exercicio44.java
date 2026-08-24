package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio44 {
    static void main(String[] args) {
        // 44. Sistema de login
        {
            boolean emailCorreto = true;
            boolean senhaCorreta = true;
            boolean contaAtiva = false;
            String resultado;

            if (!contaAtiva) {
                resultado = ("44: Conta bloqueada");
            } else if (emailCorreto && senhaCorreta) {
                resultado = ("44: Login realizado");
            } else {
                resultado = ("44: Dados inválidos");
            }
            System.out.println(resultado);
        }
    }
}
