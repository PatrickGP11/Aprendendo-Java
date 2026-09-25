package flamingo.aprendendo.revisaoarray;

public class ArrayRevisaoPt02 {
    static void main(String[] args) {
        String[] nomes = new String[4];

        nomes[0] = "Goku";
        nomes[1] = "Luffy";
        nomes[2] = "Ichigo";
        nomes[3] = "Zoro";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[1]);
        }

        nomes = new String[5];

        nomes[4] = "Zaraki";

        System.out.println();
    }
}
