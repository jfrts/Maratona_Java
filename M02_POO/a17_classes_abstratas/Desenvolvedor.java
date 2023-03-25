package M02_POO.a17_classes_abstratas;

public class Desenvolvedor extends Funcionario {
    private final int PORCENTUAL_DE_BONUS = 10;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + (this.salario * this.PORCENTUAL_DE_BONUS / 100);
    }
}
