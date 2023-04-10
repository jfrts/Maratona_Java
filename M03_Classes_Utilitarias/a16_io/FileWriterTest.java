package M03_Classes_Utilitarias.a16_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * File
 * FileWriter
 * FileReader
 * BufferedWriter
 * BufferedReader
 * 
 */
public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("M03_Classes_Utilitarias/a16_io/file02.txt");
        
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Testando escrita...");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("\nAdicionando outro texto no fim do arquivo...");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}