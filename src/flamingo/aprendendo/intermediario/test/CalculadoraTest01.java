package flamingo.aprendendo.intermediario.test;

import flamingo.aprendendo.intermediario.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int numero2 = sc.nextInt();

        calculadora.multiplicar(numero1, numero2);
        calculadora.soma(numero1, numero2);
        calculadora.subtrair(numero1, numero2);;

        sc.close();
    }
}
