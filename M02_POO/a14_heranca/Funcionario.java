package M02_POO.a14_heranca;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void relatorioDePagamento() {
        // System.out.println("Eu " + this.getNome() + " recebi o salário...");
        
        // Podemos usar o modificador de acesso protected e usar this.nome diretamente.
        System.out.println("Eu " + this.nome + " recebi o salário...");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
