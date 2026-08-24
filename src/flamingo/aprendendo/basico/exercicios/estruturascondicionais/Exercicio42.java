package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio42 {
    static void main(String[] args) {
        // 42. Sistema de compra
        {
            double saldo = 40.0;
            double valorProduto = 100.0;
            boolean clienteVip = true;
            String resultado;

            if (saldo >= valorProduto) {
                resultado =("42: Compra aprovada");
            } else if (clienteVip) {
                resultado =("42: Compra aprovada pelo crédito VIP");
            } else {
                resultado =("42: Compra recusada");
            }
            System.out.println(resultado);
        }
    }
}
