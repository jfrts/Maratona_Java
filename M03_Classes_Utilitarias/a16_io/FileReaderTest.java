package M03_Classes_Utilitarias.a16_io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("M03_Classes_Utilitarias/a16_io/file02.txt");

        try (FileReader fr = new FileReader(file)) {
            int aux;

            while ((aux = fr.read()) != -1) {
                System.out.print((char) aux);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
