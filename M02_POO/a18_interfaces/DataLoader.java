package M02_POO.a18_interfaces;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10; 

    // public e abstract são padrões nas interfaces do java, então não precisamos
    // utilizá-los.
    public abstract void load();

    // Para adicionar um método implementado precisamos usar a palavra default
    default void checkPermission() {
        System.out.println("Verificando permissão...");
    };

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do método retrieveMaxDataSize");
    }
}
