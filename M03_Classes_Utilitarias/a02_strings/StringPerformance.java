package M03_Classes_Utilitarias.a02_strings;

public class StringPerformance {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        // concatString(100000);
        concatStringBuilder(100000);
        long fim = System.currentTimeMillis();

        System.out.println(fim - inicio);
    }

    public static void concatString(int tamanho) {
        // Esse método vai gastar mto processamento do computador.
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    // método recomendado
    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(); // multi thread
    }
}
