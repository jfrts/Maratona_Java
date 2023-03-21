package M02_POO.a11_associacao;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Sócrates");

        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        System.out.println(jogadores);
    }
}
