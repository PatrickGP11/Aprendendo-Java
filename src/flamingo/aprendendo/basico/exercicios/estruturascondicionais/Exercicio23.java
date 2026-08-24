package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio23 {
    static void main(String[] args) {
        // 23. Faixa salarial
        {
            double salario = 3500.0;
            String resultado;

            if (salario <= 1500) {
                resultado = ("23: Salário baixo");
            } else if (salario <= 3000) {
                resultado = ("23: Salário médio");
            } else if (salario <= 7000) {
                resultado = ("23: Salário bom");
            } else {
                resultado = ("23: Salário alto");
            }
            System.out.println(resultado);
        }
    }
}
