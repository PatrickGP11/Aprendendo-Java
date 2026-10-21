package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.CadastroEstudante;
import flamingo.aprendendo.listapoo.dominio.Estudante;
import flamingo.aprendendo.listapoo.dominio.ImpressoraEstudante;

public class CadastroEstudanteTest41 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        CadastroEstudante cadastro = new CadastroEstudante();
        cadastro.cadastrar(estudante1, "Patrick", 20, 'M');
        cadastro.cadastrar(estudante2, "Julia", 22, 'F');

        ImpressoraEstudante impressora = new ImpressoraEstudante();
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
