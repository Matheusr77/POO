public abstract class Midia {
    protected String titulo;
    protected int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public abstract void reproduzir();

    public abstract void exibirDetalhes();
}
