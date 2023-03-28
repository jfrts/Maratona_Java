package M02_POO.a20_exceptions.exception;

import java.io.File;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("C:\\");
        
        // Capturar a exceção: Preferir da mais específica para a mais genérica.
        try {
            file.createNewFile();
            System.out.println("Arquivo criado... " + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
