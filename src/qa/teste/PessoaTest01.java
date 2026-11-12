package qa.teste;

import qa.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa  = new Pessoa();

        pessoa.setNome("");
        pessoa.setIdade(-20);

        pessoa.dadosPessoa();

    }
}
