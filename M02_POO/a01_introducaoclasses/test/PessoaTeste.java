package M02_POO.a01_introducaoclasses.test;

import M02_POO.a01_introducaoclasses.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa personagem = new Pessoa("Luffy", 18, 'M');
        System.out.println(personagem);
    }
}
