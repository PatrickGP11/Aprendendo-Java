package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio27 {
    static void main(String[] args) {
        // 27. Categoria de produto
        {
            int codigoProduto = 2;
            String resultado;

            if (codigoProduto == 1) {
                resultado = ("27: Eletrônico");
            } else if (codigoProduto == 2) {
                resultado = ("27: Alimento");
            } else if (codigoProduto == 3) {
                resultado = ("27: Roupa");
            } else if (codigoProduto == 4) {
                resultado = ("27: Livro");
            } else {
                resultado = ("27: Categoria inválida");
            }
            System.out.println(resultado);
        }
    }
}
