package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Pessoa;

public class PessoaTest25 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Patrick";
        pessoa.idade = 20;

        System.out.println(pessoa.nome + " é maior de idade? " + pessoa.isMaiorDeIdade(18));
    }
}
