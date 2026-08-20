package flamingo.aprendendo.basico;

public class EstruturasCondicionaisPt01 {
    static void main(String[] args) {

        byte idade = 17; // idade: 17
        boolean isAutorizadoComprarBebida = idade >= 18;
        //      true
        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcoólica");
        }
    }
}
