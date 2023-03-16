package M02_POO.a02_introducaometodos.testes;

import M02_POO.a02_introducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        var num1 = 1;
        var num2 = 2;

        var calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2); // (99, 33)

        System.out.println("\nFora do bloco da funcao:");
        System.out.println("num1: " + num1); // 1
        System.out.println("num2: " + num2); // 2
    }
}
