package M02_POO.a20_exceptions.runtimeexceptions;

import java.lang.RuntimeException;

public class RuntimeException03 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo o arquivo...");
            throw new RuntimeException();
            // System.out.println("Escrevendo dados no arquivo...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional...");
        }
    }
}
