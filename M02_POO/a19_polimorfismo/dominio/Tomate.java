package M02_POO.a19_polimorfismo.dominio;

public class Tomate extends Produto {
    public static final double PORCENTAGEM_DE_IMPOSTO = 3;
    private String dataValidade;

    public Tomate(String nome, double valor, String dataValidade) {
        super(nome, valor);
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * PORCENTAGEM_DE_IMPOSTO / 100;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
