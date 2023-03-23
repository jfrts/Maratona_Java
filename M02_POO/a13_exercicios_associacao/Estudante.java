package M02_POO.a13_exercicios_associacao;

public class Estudante extends Pessoa {
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade, Seminario seminario) {
        super(nome);
        this.idade = idade;
        this.seminario = seminario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
