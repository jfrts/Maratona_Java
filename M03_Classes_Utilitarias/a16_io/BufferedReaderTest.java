package M03_Classes_Utilitarias.a16_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        File file = new File("M03_Classes_Utilitarias/a16_io/file02.txt");
        String linha;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}