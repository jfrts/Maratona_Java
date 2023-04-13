package M02_POO.a23_excecao_customizada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String loginDigitado = teclado.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = teclado.nextLine();

        String loginDB = "julio";
        String senhaDB = "123456";

        System.out.println("Login digitado: " + loginDigitado);
        System.out.println("Senha digitada: " + senhaDigitada);

        if (!loginDB.equalsIgnoreCase(loginDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Os dados digitados estao incorretos...");
        }

        System.out.println("Usuário logado...");

        teclado.close();
    }
}
