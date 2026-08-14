package flamingo.aprendendo.basico;

public class OperadoresPt02 {
    /*
     * < menor que
     * > maior que
     * <= menor ou igual
     * >= maior ou igual
     * == igual a
     * != diferente de
     * */

    static void main(String[] args) {
        byte idadeMae = 42;
        byte idadePai = 60;
        byte idadeIrmaDaMae = 41;
        System.out.println(idadeMae < idadePai);
        System.out.println(idadeMae > idadePai);
        System.out.println(idadeMae == idadeIrmaDaMae);
        System.out.println(idadeMae <= idadeIrmaDaMae);
        System.out.println(idadeMae >= idadeIrmaDaMae);
        System.out.println(idadeMae != idadeIrmaDaMae);
    }
}
