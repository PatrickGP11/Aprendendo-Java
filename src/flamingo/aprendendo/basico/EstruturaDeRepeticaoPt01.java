package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepeticaoPt01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite que tabuada você quer calcular: ");
        int numero = sc.nextInt();

        System.out.println("\n=== Tabuada do " + numero + "===");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }
        sc.close();
    }
}
