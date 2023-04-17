package M03_Classes_Utilitarias.a17_nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Sempre que trabalhar com io stream precisamos usar o comando para fechar
 * Recomenda-se então o uso de try with resources.
 */
public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path baseDir = Paths.get("M03_Classes_Utilitarias", "a17_nio");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(baseDir)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            
        }
    }
}
