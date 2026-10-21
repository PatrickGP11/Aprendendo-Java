package flamingo.aprendendo.listapoo.test;

import flamingo.aprendendo.listapoo.dominio.Funcionario;

public class FuncionarioTest28 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lucas";
        funcionario.salario = 3000.0;

        double bonus = funcionario.calcularBonus(10);

        System.out.println("Bônus de " + funcionario.nome + ": R$ " + bonus);
    }
}
