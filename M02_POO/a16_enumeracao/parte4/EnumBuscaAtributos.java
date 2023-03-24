package M02_POO.a16_enumeracao.parte4;

public enum EnumBuscaAtributos {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURÍDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nomeRelatorio;

    EnumBuscaAtributos(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static EnumBuscaAtributos tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (EnumBuscaAtributos tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    }

    public int getValor() {
        return this.valor;
    }

    public String getNomeRelatorio() {
        return this.nomeRelatorio;
    }
}
