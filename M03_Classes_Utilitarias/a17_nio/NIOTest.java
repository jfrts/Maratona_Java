package M03_Classes_Utilitarias.a17_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * A equipe java criou a interface PATH para substituir a classe File
 */
public class NIOTest {
    public static void main(String[] args) {
        Path path = Paths.get("M03_Classes_Utilitarias", "a17_nio");
        System.out.println(path);

        System.out.println(path.toAbsolutePath());
    }
}
