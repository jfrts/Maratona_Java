package M02_POO.a16_enumeracao.parte2;

public class Cliente {
    public enum TipoCliente {
        PESSOA_FISICA,
        PESSOA_JURIDICA
    }

    private String nome;
    private TipoCliente tipoDeCliente;

    public Cliente(String nome, TipoCliente tipoDeCliente) {
        this.nome = nome;
        this.tipoDeCliente = tipoDeCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoDeCliente() {
        return tipoDeCliente;
    }

    public void setTipoDeCliente(TipoCliente tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
    }
}
