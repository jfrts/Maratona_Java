package M02_POO.a17_classes_abstratas;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.calculaBonus();
    }

    public abstract void calculaBonus();

    

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
    }
}
