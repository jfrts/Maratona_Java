package M02_POO.a11_associacao;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
