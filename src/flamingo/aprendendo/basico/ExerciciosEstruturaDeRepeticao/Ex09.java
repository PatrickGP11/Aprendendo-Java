package flamingo.aprendendo.basico.ExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Ex09 {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int tentativas = 0;
       String senhaCorreta = "admin123";

       while (tentativas < 3) {
           System.out.println("Tentando fazer login... ");
           System.out.println("Digite a senha: ");
           String senha = sc.nextLine();

           if (senha.equals(senhaCorreta)) {
               System.out.println("Senha correta!");
               break;
           }else {
               tentativas++;
               if (tentativas == 3) {
                   System.out.println("Número máximo de tentativas atingidas");
               }else {
                   System.out.println("Senha incorreta. Tente novamente");
               }
               sc.close();
           }
       }
    }
}
