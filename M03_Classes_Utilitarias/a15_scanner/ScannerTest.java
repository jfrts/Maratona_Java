package M03_Classes_Utilitarias.a15_scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        String texto = "Levi,Eren,Mikasa,true,200";
        
        /**
         * Sem scanner
         */
        String[] nomes = texto.split(",");

        System.out.println("Sem scanner:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        /**
         * Com scanner
         * 
         * A classe scanner tem como delimitador padrão o espaço em branco " ",
         * para alterar é preciso utilizar o método useDelimiter
         */
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        
        System.out.println("\nCom scanner:");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
        
    }
}
