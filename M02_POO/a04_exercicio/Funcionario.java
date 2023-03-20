package M02_POO.a04_exercicio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    Funcionario(String nome, int idade, double[] salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public double mediaSalarial() {
        double total = 0;

        for (double salario : this.salarios) {
            total += salario;
        }

        double media = total / this.salarios.length;
        
        return media;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", idade=" + idade + ", salario=" + Arrays.toString(salarios) + "]";
    };

}
