package M03_Classes_Utilitarias.a16_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("M03_Classes_Utilitarias/a16_io/fileBufferedWriter.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Teste de texto");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
