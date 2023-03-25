package M02_POO.a17_classes_abstratas;

public class Main {
    public static void main(String[] args) {
        // Ao inserir abstract na classe Funcionario não podemos mais instanciar um objeto a partir da classe Funcionario
        // Funcionario funcionario = new Funcionario("Zoro", 2000);
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor dev = new Desenvolvedor("Usopp", 12000);

        System.out.println(gerente);
        System.out.println(dev);
    }
}
