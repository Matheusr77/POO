public class Moto extends Veiculo implements Financiavel {
    private static final double TAXA_JUROS = 0.05;

    public Moto(String modelo, String marca, double preco) {
        super(modelo, marca, preco);
    }

    public void vender() {
        System.out.println("Moto vendida: " + modelo + " da marca " + marca + " por R$" + preco);
    }

    public void exibirDetalhes() {
        System.out.printf("Moto - Modelo: %s, Marca: %s, Preço: R$ %.2f\n", modelo, marca, preco);
    }

    public double calcularParcela(int meses) {
        double totalComJuros = preco + (preco * TAXA_JUROS);
        return totalComJuros / meses;
    }

    public void exibirCondicoesFinanciamento(int meses) {
        double parcela = calcularParcela(meses);
        System.out.printf("Financiamento Moto - Modelo: %s\nParcelas: %d meses, Valor da parcela: R$ %.2f\n",
                modelo, meses, parcela);
    }
}
