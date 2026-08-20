package flamingo.aprendendo.introducao;

public class TiposPrimitivos {
    static void main(String[] args) {
        // byte : -128 até 127
        // short : _32.768 a 32.767
        // int : -2 bilhões a 2 bilhões
        // long : Para numeros inteiros muito grande (usa um L no final do número)
        // float: Precisão simples (usa um f no final, ex: 5.5f
        // char: Guarda uma única letra ou símbolo em formato Unicode (ex: 'A')
        byte idade = 20;
        int municipio = 1140000000;
        long contaBancaria = 999999999999999999L;
        float salario = 15000.10f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'P';
        boolean vaiEstudarNasFerias = false;
        System.out.println(vaiEstudarNasFerias);
        System.out.println("Primeira letra do meu nome é " + primeiraLetraDoNome);
        System.out.println("PL caiu " + salarioExtra);
        System.out.println("Meu salario depois depois de estudar com bigas é" + salario);
        System.out.println("Minha idade é " + idade);
        System.out.println("São Paulo (SP): Mais de " + municipio + " milhões de moradores.");
        System.out.println("Minha conta bancaria daqui a 5 anos" + contaBancaria);
    }
}
