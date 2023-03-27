package M02_POO.a19_polimorfismo.repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {   
        System.out.println("Salvando em memória...");
    }
}
