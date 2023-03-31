package M03_Classes_Utilitarias.a02_strings;


/**
 * String são imutáveis
 * 
 */

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Julio"; // String constant pool
        String nome2 = "Julio";

        nome = nome.concat(" Freitas");

        String nome3 = new String("Julio"); // Vai criar o objeto String dentro da memória Heap, e não no pool de strings.

        System.out.println(nome); // "Julio Freitas"
        System.out.println(nome == nome2); // False por conta da reatribuição na linha 14.

        System.out.println(nome2 == nome3); // False: Linha 16.
        System.out.println(nome2 == nome3.intern()); // True: o método intern busca a referência dentro do pool de strings.
        
        // é pouco usual criar String usando o método da linha 16.
    }
}
