package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio41 {
    static void main(String[] args) {
        // 41. Sistema de aprovação completo
        {
            double nota = 6.0;
            double presenca = 80.0;
            String resultado;

            if (nota >= 7 && presenca >= 75) {
                resultado = ("41: Aprovado");
            } else if (nota >= 5 && nota < 7) {
                resultado = ("41: Recuperação");
            } else {
                resultado = ("41: Reprovado");
            }
            System.out.println(resultado);
        }
    }
}
