package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio16 {
    static void main(String[] args) {
        // 16. Produto com desconto
        {
            double valorCompra = 250.0;
            if (valorCompra >= 200) {
                double valorComDesconto = valorCompra - (valorCompra * 0.10);
                System.out.println("16: Valor final com desconto: R$ " + valorComDesconto);
            } else {
                System.out.println("16: Valor original: R$ " + valorCompra);
            }
        }
    }
}
