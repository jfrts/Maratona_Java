package M03_Classes_Utilitarias.a16_io;

import java.io.File;
import java.io.IOException;

public class FileDirTest {
    public static void main(String[] args) {
        File dir = new File("M03_Classes_Utilitarias/a16_io/dir");
        
        dir.mkdir();

        File file = new File(dir.getPath() + "/filedir.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
