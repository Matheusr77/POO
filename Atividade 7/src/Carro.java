public class Carro extends Veiculo implements Financiavel {
    private static final double TAXA_JUROS = 0.10;

    public Carro(String modelo, String marca, double preco) {
        super(modelo, marca, preco);
    }

    @Override
    public void vender() {
        System.out.println("Carro vendido: " + modelo + " da marca " + marca + " por R$" + preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Carro - Modelo: %s, Marca: %s, Preço: R$ %.2f\n", modelo, marca, preco);
    }

    @Override
    public double calcularParcela(int meses) {
        double totalComJuros = preco + (preco * TAXA_JUROS);
        return totalComJuros / meses;
    }

    @Override
    public void exibirCondicoesFinanciamento(int meses) {
        double parcela = calcularParcela(meses);
        System.out.printf("Financiamento Carro - Modelo: %s\nParcelas: %d meses, Valor da parcela: R$ %.2f\n",
                modelo, meses, parcela);
    }
}
