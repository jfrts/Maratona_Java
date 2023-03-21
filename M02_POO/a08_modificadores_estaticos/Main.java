package M02_POO.a08_modificadores_estaticos;

public class Main {
    public static void main(String[] args) {
        Carro bmw = new Carro("BMW", 280);
        Carro fuscao = new Carro("Fuscão", 300);
        Carro uno = new Carro("Uno Mili", 500);

        System.out.println(bmw);
        System.out.println(fuscao);
        System.out.println(uno);

        Carro.velocidadeLimite = 300;

        System.out.println(bmw);
        System.out.println(fuscao);
        System.out.println(uno);
    }
}
