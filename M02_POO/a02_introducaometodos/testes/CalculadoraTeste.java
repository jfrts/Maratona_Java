package M02_POO.a02_introducaometodos.testes;

import M02_POO.a02_introducaometodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somaDoisNumeros(20, 21));
    }
}
