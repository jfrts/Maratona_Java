package M03_Classes_Utilitarias.a13_resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Resource Bundle é uma forma de internacionalizar as mensagens da aplicação.
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        System.out.println("\nEN-US");
        ResourceBundle bundleEN = ResourceBundle.getBundle("M03_Classes_Utilitarias.a13_resourceBundle.messages", new Locale("en", "US"));
        System.out.println(bundleEN.getString("hello")); // Hello
        System.out.println(bundleEN.getString("good.morning")); // Good Morning

        System.out.println("\nPT-BR");
        ResourceBundle bundleBR = ResourceBundle.getBundle("M03_Classes_Utilitarias.a13_resourceBundle.messages", new Locale("pt", "BR"));
        System.out.println(bundleBR.getString("hello")); // Olá
        System.out.println(bundleBR.getString("good.morning")); // Bom dia

        
        /*
         * Fallback
         * 
         * Locale("fr", "CA");
         * 
         * 1 - messages_fr_CA.properties 
         * 2 - messages_fr.properties
         * 3 - messages_en_US.properties -> Padrão do sistema do usuário
         * 4 - messages_en.properties -> Padrão do sistema do usuário
         * 5 - messages.properties
         */
    }
}
