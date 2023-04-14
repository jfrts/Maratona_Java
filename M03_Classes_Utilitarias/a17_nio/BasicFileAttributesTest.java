package M03_Classes_Utilitarias.a17_nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest {
    public static void main(String[] args) {
        File file = new File("M03_Classes_Utilitarias/a17_nio/basic_attributes/teste.txt");

        LocalDateTime date = LocalDateTime.now().minusDays(10);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        /*
         *   Files.isReadable("Path");
         *   Files.isWritable("Path");
         *   Files.isExecutable("Path");
         */

    }
}
