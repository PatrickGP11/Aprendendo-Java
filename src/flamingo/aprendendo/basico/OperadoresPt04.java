package flamingo.aprendendo.basico;

public class OperadoresPt04 {
    static void main(String[] args) {
        // || OR -> OU
        double dinheiro = 220.0;
        boolean amigoBanca = false;

        boolean isEntradaFesta = dinheiro > 200 || amigoBanca;

        System.out.println(isEntradaFesta);
    }
}
