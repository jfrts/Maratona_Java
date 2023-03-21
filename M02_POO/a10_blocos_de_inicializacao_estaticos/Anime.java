package M02_POO.a10_blocos_de_inicializacao_estaticos;

public class Anime {
    private String nome;
    private static int[] episodios;

    // basta adicionar o modificador de acesso static antes do bloco de inicialização
    static {
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
