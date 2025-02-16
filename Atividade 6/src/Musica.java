public class Musica extends Midia {
    private String artista;
    private String album;

    public Musica(String titulo, int ano, String artista, String album) {
        super(titulo, ano);
        this.artista = artista;
        this.album = album;
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + titulo + " de " + artista);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Música: %s (%d)\nArtista: %s\nÁlbum: %s\n\n", titulo, ano, artista, album);
    }
}
