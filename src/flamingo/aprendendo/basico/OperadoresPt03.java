package flamingo.aprendendo.basico;

public class OperadoresPt03 {
    static void main(String[] args) {
        /*
        * && AND -> E
        * || OUR -> OU
        * | NOT -> NÃO
        * */

        byte idade = 16;
        boolean issCNH = true;

        boolean isEstaNaLeiParaDirigir = idade >= 18 && issCNH == true;

        System.out.println(isEstaNaLeiParaDirigir);
    }
}
