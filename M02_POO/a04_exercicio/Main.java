package M02_POO.a04_exercicio;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Júlio", 28, new double[]{5000, 2000, 3000});

        System.out.println(func.mediaSalarial());
        System.out.println(func);
    }
}
