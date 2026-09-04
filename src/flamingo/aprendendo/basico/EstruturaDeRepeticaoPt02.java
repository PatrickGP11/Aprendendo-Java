package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturaDeRepeticaoPt02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual tabuada você quer calcular");
        int numero = sc.nextInt();

        int i = 1;
        System.out.println(" \n=== Tabuada do " + numero + " === ");

        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
            i++;
        }
        sc.close();
    }
}
