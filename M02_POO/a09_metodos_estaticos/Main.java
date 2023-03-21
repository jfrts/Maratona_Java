package M02_POO.a09_metodos_estaticos;

public class Main {
    public static void main(String[] args) {
        Carro bmw = new Carro("BMW", 280);
        Carro fuscao = new Carro("Fuscão", 300);
        Carro uno = new Carro("Uno Mili", 500);

        System.out.println(bmw);
        System.out.println(fuscao);
        System.out.println(uno);

        // única diferença para a aula anterior
        Carro.setVelocidadeLimite(300);

        System.out.println(bmw);
        System.out.println(fuscao);
        System.out.println(uno);
    }
}


