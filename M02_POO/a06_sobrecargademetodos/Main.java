package M02_POO.a06_sobrecargademetodos;

public class Main {
    public static void main(String[] args) {
        Anime anime = new Anime("Nome", "TV", 12);

        anime.setTipo("TV");
        anime.setEpisodios(12);
    }
}
