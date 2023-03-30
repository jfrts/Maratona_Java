package M02_POO.a24_excecoes_e_regras_sobrescrita;

import java.io.FileNotFoundException;

import M02_POO.a23_excecao_customizada.LoginInvalidoException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
