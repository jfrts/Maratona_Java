package M02_POO.a16_enumeracao.parte2;

public enum EnumConstrutoresEAtributos {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    EnumConstrutoresEAtributos(int valor) {
        this.VALOR = valor;
    }
}
