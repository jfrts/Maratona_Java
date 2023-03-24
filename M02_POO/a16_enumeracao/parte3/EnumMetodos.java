package M02_POO.a16_enumeracao.parte3;

public enum EnumMetodos {
    DEBITO {
        private final double PORCENTAGEM_DE_DESCONTO = 10;

        @Override
        public double CalcularDesconto(double valor) {
            return valor * (PORCENTAGEM_DE_DESCONTO / 100);
        }
    },
    
    CREDITO {
        private final double PORCENTAGEM_DE_DESCONTO = 5;

        @Override
        public double CalcularDesconto(double valor) {
            return valor * (PORCENTAGEM_DE_DESCONTO / 100);
        }
    };

    public abstract double CalcularDesconto(double valor);
}
