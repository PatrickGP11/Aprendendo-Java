package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio20 {
    static void main(String[] args) {
        // 20. Verificar acesso
        {
            boolean temPermissao = true;
            String resultado;

            if (temPermissao) {
                resultado = ("20: Acesso liberado.");
            } else {
                resultado = ("20: Acesso negado.");
            }
            System.out.println(resultado);
        }
    }
}
