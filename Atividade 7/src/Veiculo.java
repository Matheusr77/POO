public abstract class Veiculo {
    protected String modelo;
    protected String marca;
    protected double preco;

    public Veiculo(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void vender();

    public abstract void exibirDetalhes();
}
