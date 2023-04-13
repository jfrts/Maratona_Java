package M03_Classes_Utilitarias.a17_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest {
    public static void main(String[] args) {
        String diretorioProjeto = "home/jfrts/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1); // home\jfrts\dev\..\..\arquivo.txt
        System.out.println(path1.normalize()); // home\arquivo.txt
    }
}
