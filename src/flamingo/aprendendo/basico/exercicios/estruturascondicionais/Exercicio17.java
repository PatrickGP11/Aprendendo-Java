package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio17 {
    static void main(String[] args) {
        // 17. Verificar CNH
        {
            int idade = 20;
            boolean temCNH = true;
            if (idade >= 18 && temCNH) {
                System.out.println("17: Pode dirigir.");
            } else {
                System.out.println("17: Não pode dirigir.");
            }
        }
    }
}
