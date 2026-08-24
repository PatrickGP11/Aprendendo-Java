package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio26 {
    static void main(String[] args) {
        // 26. Status do pedido
        {
            int statusPedido = 3;
            String resultado;

            if (statusPedido == 1) {
               resultado = ("26: Pedido recebido");
            } else if (statusPedido == 2) {
               resultado = ("26: Pedido em preparação");
            } else if (statusPedido == 3) {
               resultado = ("26: Pedido enviado");
            } else if (statusPedido == 4) {
               resultado = ("26: Pedido entregue");
            } else {
               resultado = ("26: Status inválido");
            }
            System.out.println(resultado);
        }
    }
}
