package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Termometro;

public class TermometroTest29 {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 38.5;

        System.out.println("Passou do limite de 37? " + termometro.passouDoLimite(37.0));
    }
}
