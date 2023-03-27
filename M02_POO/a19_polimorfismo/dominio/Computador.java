package M02_POO.a19_polimorfismo.dominio;

public class Computador extends Produto {
    public static final double PORCENTAGEM_DE_IMPOSTO = 5;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * PORCENTAGEM_DE_IMPOSTO / 100;
    }
}
