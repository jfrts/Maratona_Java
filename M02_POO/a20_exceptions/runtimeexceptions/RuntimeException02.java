package M02_POO.a20_exceptions.runtimeexceptions;

public class RuntimeException02 {
    public static void main(String[] args) {
        divide(1, 0);
    }

    public static Double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("O valor de B deve ser diferente de 0.");
        }
       
        return a / b;
    }
}
