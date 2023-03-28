package M02_POO.a20_exceptions.error;

public class Stackoverflow {
    public static void main(String[] args) {
        recursivo();
    }

    public static void recursivo() {
        recursivo();
    }
}
