package M02_POO.a15_modificador_final;

public class Carro {
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    private String nome;

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }
}
