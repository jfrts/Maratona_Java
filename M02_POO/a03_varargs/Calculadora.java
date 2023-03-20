package M02_POO.a03_varargs;

public class Calculadora {
    
    public int somaArray(int[] numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total;
    }

    public int somaVarArgs(int... numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total;
    }

}
