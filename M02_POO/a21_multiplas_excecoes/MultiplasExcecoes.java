package M02_POO.a21_multiplas_excecoes;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasExcecoes {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBounds");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgument");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {
            System.out.println("SQLException");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
