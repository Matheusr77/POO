public class Video extends Midia {
    private String diretor;
    private int duracao;

    public Video(String titulo, int ano, String diretor, int duracao) {
        super(titulo, ano);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo vídeo: " + titulo + " dirigido por " + diretor);
    }

    public void exibirDetalhes() {
        System.out.printf("Vídeo: %s (%d)\nDiretor: %s\nDuração: %d minutos\n\n", titulo, ano, diretor, duracao);
    }
}
