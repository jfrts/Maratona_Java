package M02_POO.a23_excecao_customizada;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException(String message) {
        super(message);
    }

}
