package M02_POO.a16_enumeracao;

// É uma forma limitadora de valor para ser atribuido. 
public class Cliente {
    private String nome;
    private String tipoIncorreto;
    private TipoDeCliente tipoCorreto;

    public Cliente(String nome, String tipoIncorreto) {
        this.nome = nome;
        this.tipoIncorreto = tipoIncorreto;
    }

    public Cliente(String nome, TipoDeCliente tipoCorreto) {
        this.nome = nome;
        this.tipoCorreto = tipoCorreto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoIncorreto() {
        return tipoIncorreto;
    }

    public void setTipoIncorreto(String tipoIncorreto) {
        this.tipoIncorreto = tipoIncorreto;
    }

    public TipoDeCliente getTipoCorreto() {
        return tipoCorreto;
    }

    public void setTipoCorreto(TipoDeCliente tipoCorreto) {
        this.tipoCorreto = tipoCorreto;
    }
}
