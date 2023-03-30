package M02_POO.a22_try_with_resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {
    public static void main(String[] args) {

    }

    // Modo antigo
    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Modo novo e mais recomendado
    public static void lerArquivo02() {
        try (Reader reader = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println("Lendo o arquivo...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
