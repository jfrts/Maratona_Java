package M03_Classes_Utilitarias.a14_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Usando metacaracteres para encontrar padrões em textos.
 * Muito usado para validações
 */
public class RegexTest {
    public static void main(String[] args) {
        String regex = "ab";
        
        String texto = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println(matcher); // java.util.regex.Matcher[pattern=ab region=0,6 lastmatch=]

        while (matcher.find()) {
            System.out.print(matcher.start() + " "); // 0 3
        }

        System.out.println("\nSegundo exemplo:");
        
        String regex2 = "aba";
        String texto2 = "abababa";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(texto2);

        while (matcher2.find()) {
            System.out.print(matcher2.start() + " "); // 0 4 -> O comportamento da classe matcher é de não voltar o índice após encontrar um resultado.
                                                      // Por isso não retorna 0 2 4.
        }   

        /**
         * Meta Caracteres
         * 
         * \d = Todos os dígitos
         * \D = Tudo que não for dígito
         * \s = Espaços em branco \t \n \f \r
         * \S = Todos os caracteres excluindo os espaços em branco
         * \w = a-zA-Z, digitos e _
         * \W = Tudo que não estiver incluso no \w
         * 
         */

        /**
         * Quantificadores
         * 
         * ? = Zero ou uma
         * * = Zero ou mais
         * + = Uma ou mais
         * {n,m} = De n até m
         * () = Agrupar
         * | = Ou -> [o(v|c)o -> ovo e oco]
         * $
         * .
         */
    }
}
