package M03_Classes_Utilitarias.a02_strings;

// Com StringBuilder não temos mais o conceito de imutabilidade das string, pois ele não é uma.
public class StringBuilderTest {
    public static void main(String[] args) {
        String nome = "Julio";
        String sobrenome = "Freitas";
        
        StringBuilder sb = new StringBuilder(16);
        sb.append(nome);
        sb.append(" ");
        sb.append(sobrenome);

        System.out.println(sb);
    }   
}
