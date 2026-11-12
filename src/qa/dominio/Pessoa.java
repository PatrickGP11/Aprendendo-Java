package qa.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        if (nome == null || nome.trim() == "") {
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 128) {
            System.out.println("Idade Inválida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void dadosPessoa() {
        if (this.nome == null) {
            System.out.println("Nome inválido");
            return;
        }
        System.out.println(getNome());
        System.out.println(getIdade());
    }
}


