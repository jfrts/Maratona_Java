package M02_POO.a18_interfaces;

public class FileLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo...");
    }

}
