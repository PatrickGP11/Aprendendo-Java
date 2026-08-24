package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio33 {
    static void main(String[] args) {
        // 33. Saldo suficiente
        {
            double saldo = 80.0;
            double valorProduto = 100.0;
            String resultado = (saldo >= valorProduto) ? "Compra aprovada" : "Saldo insuficiente";
            System.out.println("33: " + resultado);
        }
    }
}
