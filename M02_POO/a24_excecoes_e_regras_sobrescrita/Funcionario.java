package M02_POO.a24_excecoes_e_regras_sobrescrita;

public class Funcionario extends Pessoa {

    @Override
    public void salvar() {
        System.out.println("Salvando funcionário");
    }

}
