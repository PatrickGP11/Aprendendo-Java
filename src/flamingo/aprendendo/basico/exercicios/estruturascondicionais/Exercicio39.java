package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio39 {
    static void main(String[] args) {
        // 39. Frete
        {
            double valorCompra = 160.0;
            int frete = (valorCompra >= 150) ? 0 : 20;
            System.out.println("39: Valor do frete: R$ " + frete);
        }
    }
}
