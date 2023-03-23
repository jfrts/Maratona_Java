package M02_POO.a13_exercicios_associacao;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private String especialidade;
    private ArrayList<Seminario> seminarios;

    public Professor(String nome, String especialidade, Seminario seminario) {
        super(nome);
        this.especialidade = especialidade;
        this.seminarios = new ArrayList<>();
        this.adicionarSeminario(seminario);
    }

    public void adicionarSeminario(Seminario seminario) {
        this.seminarios.add(seminario);
    }

    public void listarSeminarios() {
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
