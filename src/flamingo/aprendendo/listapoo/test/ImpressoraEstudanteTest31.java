package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Estudante;
import flamingo.aprendendo.listapoo.dominio.ImpressoraEstudante;

public class ImpressoraEstudanteTest31 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.nome = "Patrick";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Julia";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
