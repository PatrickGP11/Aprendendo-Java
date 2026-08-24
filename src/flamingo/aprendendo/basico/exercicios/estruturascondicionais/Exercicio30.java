package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio30 {
    static void main(String[] args) {
        // 30. Desconto por tipo de cliente
        {
            int tipoCliente = 3;
            double valorCompra = 200.0;
            double valorFinal = valorCompra;

            if (tipoCliente == 1) {
                valorFinal = valorCompra;
            } else if (tipoCliente == 2) {
                valorFinal = valorCompra - (valorCompra * 0.05);
            } else if (tipoCliente == 3) {
                valorFinal = valorCompra - (valorCompra * 0.10);
            } else if (tipoCliente == 4) {
                valorFinal = valorCompra - (valorCompra * 0.15);
            }

            System.out.println("30: Valor final com desconto: R$ " + valorFinal);
        }
    }
}

