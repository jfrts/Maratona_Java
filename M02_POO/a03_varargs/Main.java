package M02_POO.a03_varargs;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // int total = calc.somaArray(new int[]{1, 2, 3, 4, 5});

        int total = calc.somaVarArgs(1, 2, 3, 4, 5);
    
        System.out.println(total);
    }
}
