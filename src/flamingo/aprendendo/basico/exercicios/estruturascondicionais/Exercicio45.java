package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio45 {
    static void main(String[] args) {
        // 44. Sistema de login
        {
            boolean emailCorreto = true;
            boolean senhaCorreta = true;
            boolean contaAtiva = false;

            if (!contaAtiva) {
                System.out.println("44: Conta bloqueada");
            } else if (emailCorreto && senhaCorreta) {
                System.out.println("44: Login realizado");
            } else {
                System.out.println("44: Dados inválidos");
            }
        }

        // 45. Sistema de desconto progressivo
        {
            double valorCompra = 450.0;
            double porcentagemDesconto;

            if (valorCompra <= 100) {
                porcentagemDesconto = 0;
            } else if (valorCompra <= 300) {
                porcentagemDesconto = 5;
            } else if (valorCompra <= 500) {
                porcentagemDesconto = 10;
            } else {
                porcentagemDesconto = 15;
            }

            double valorDesconto = valorCompra * (porcentagemDesconto / 100);
            double valorFinal = valorCompra - valorDesconto;

            System.out.println("45: Valor original: R$ " + valorCompra);
            System.out.println("45: Porcentagem de desconto: " + porcentagemDesconto + "%");
            System.out.println("45: Valor do desconto: R$ " + valorDesconto);
            System.out.println("45: Valor final da compra: R$ " + valorFinal);
        }
    }
}

