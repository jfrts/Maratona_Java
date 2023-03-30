package M02_POO.a20_exceptions.exception;

import java.io.File;
import java.io.IOException;

public class Exception02 {
    public static void main(String[] args) {
        try {
            criarNovoArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("C:\\");
        
        // Capturar a exceção: Preferir da mais específica para a mais genérica.
        try {
            file.createNewFile();
            System.out.println("Arquivo criado... " + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
