package M02_POO.a15_modificador_final;

public final class Ferrari extends Carro {
    private String modelo;

    public Ferrari(String nome, String modelo) {
        super(nome);
        this.modelo = modelo;
    }

    // @Override
    // public void imprime() {
    //     System.out.println("Erro: Cannot overrride the final method from Carro");
    // }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
