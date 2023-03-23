package M02_POO.a13_exercicios_associacao;

import java.util.ArrayList;

public class Seminario {
    private String titulo;
    private ArrayList<Estudante> estudantes;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.estudantes = new ArrayList<>();
        this.local = local;
    }

    public Seminario(String titulo, ArrayList<Estudante> estudantes, Local local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }

    public void adicionarEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public void listarEstudantes() {
        for (Estudante estudante : this.estudantes) {
            System.out.println(estudante.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
