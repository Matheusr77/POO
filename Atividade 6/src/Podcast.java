public class Podcast extends Midia {
    private String anfitriao;
    private int episodio;

    public Podcast(String titulo, int ano, String anfitriao, int episodio) {
        super(titulo, ano);
        this.anfitriao = anfitriao;
        this.episodio = episodio;
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando podcast: Episódio " + episodio + " de " + titulo + " com " + anfitriao);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Podcast: %s (%d)\nAnfitrião: %s\nEpisódio: %d\n\n", titulo, ano, anfitriao, episodio);
    }
}
