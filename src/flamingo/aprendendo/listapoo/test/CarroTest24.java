package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Carro;

public class CarroTest24 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fiat";
        carro.velocidadeAtual = 80;

        String mensagem = carro.gerarMensagemMulta(60);

        System.out.println(mensagem);
    }
}
