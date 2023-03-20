package M02_POO.a07_blocodeinicializacao;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

    }
}
