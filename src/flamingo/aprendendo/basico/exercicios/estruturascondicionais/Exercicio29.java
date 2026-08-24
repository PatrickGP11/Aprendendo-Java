package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio29 {
    static void main(String[] args) {
        // 29. IMC simplificado
        {
            double imc = 28.4;
            String resultado;

            if (imc < 18.5) {
                resultado = ("29: Abaixo do peso");
            } else if (imc <= 24.9) {
                resultado = ("29: Peso normal");
            } else if (imc <= 29.9) {
                resultado = ("29: Sobrepeso");
            } else {
                resultado = ("29: Obesidade");
            }
            System.out.println(resultado);
        }
    }
}
