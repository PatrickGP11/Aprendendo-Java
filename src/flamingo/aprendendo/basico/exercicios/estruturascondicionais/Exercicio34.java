package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio34 {
    static void main(String[] args) {
        // 34. Número par ou ímpar
        {
            int numero = 15;
            String resultado = (numero % 2 == 0) ? "Número par" : "Número ímpar";
            System.out.println("34: " + resultado);
        }
    }
}
