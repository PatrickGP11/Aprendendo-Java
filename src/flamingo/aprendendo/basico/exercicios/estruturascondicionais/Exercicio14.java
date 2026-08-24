package flamingo.aprendendo.basico.exercicios.estruturascondicionais;

public class Exercicio14 {
    static void main(String[] args) {
        // 14. Login no sistema
        {
            boolean emailCorreto = true;
            boolean senhaCorreta = false;
            if (emailCorreto && senhaCorreta) {
                System.out.println("14: Login realizado com sucesso.");
            } else {
                System.out.println("14: Email ou senha inválidos.");
            }
        }
    }
}
