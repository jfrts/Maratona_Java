package M02_POO.a18_interfaces;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do arquivo...");
    }

}
