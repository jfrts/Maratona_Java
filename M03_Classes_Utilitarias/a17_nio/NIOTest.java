package M03_Classes_Utilitarias.a17_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * A equipe java criou a interface PATH para substituir a classe File
 */
public class NIOTest {
    public static void main(String[] args) {
        Path path = Paths.get("M03_Classes_Utilitarias", "a17_nio", "pasta");

        if (Files.notExists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Path filePath = Paths.get(path.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Path source = filePath;
        Path target = Paths.get(path.toString(), "file-renamed.txt");
        
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
