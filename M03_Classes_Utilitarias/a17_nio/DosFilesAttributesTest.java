package M03_Classes_Utilitarias.a17_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DosFilesAttributesTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("M03_Classes_Utilitarias/a17_nio/dos/dos-test.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);

        DosFileAttributes dosFileAttr = Files.readAttributes(path, DosFileAttributes.class); 
        System.out.println("DosFilesAttributes: " + dosFileAttr); // DosFilesAttributes: sun.nio.fs.WindowsFileAttributes@3a71f4dd

        System.out.println(dosFileAttr.isHidden()); // true
        System.out.println(dosFileAttr.isReadOnly()); // true
        System.out.println(dosFileAttr.isSystem()); // false
    }
}