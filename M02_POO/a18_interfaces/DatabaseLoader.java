package M02_POO.a18_interfaces;

public class DatabaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados...");
    }
    
}
