package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio06 {
    // 6) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
    //área do retângulo
    
    static void main(String[] args) {
        double altura, base, area;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a base do retângulo: ");
        base = sc.nextDouble();

        System.out.println("Digite a Altura do retângulo");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("A Área do retângulo = %.2f", area);
        
        sc.close();
    }
}
