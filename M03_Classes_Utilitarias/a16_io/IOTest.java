package M03_Classes_Utilitarias.a16_io;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class IOTest {
    public static void main(String[] args) {
        File file = new File("M03_Classes_Utilitarias/a16_io/file.txt");

        try {
            if (file.exists()) {
                file.delete();
            }
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ultima modificaçao: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
    }
}
