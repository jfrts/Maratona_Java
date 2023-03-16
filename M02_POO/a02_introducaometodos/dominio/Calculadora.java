package M02_POO.a02_introducaometodos.dominio;

public class Calculadora {
    public int somaDoisNumeros(int num1, int num2) {
        return num1 + num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
