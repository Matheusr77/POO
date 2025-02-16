public class Caminhao extends Veiculo implements Financiavel {
    private static final double TAXA_JUROS = 0.15;

    public Caminhao(String modelo, String marca, double preco) {
        super(modelo, marca, preco);
    }

    public void vender() {
        System.out.println("Caminhão vendido: " + modelo + " da marca " + marca + " por R$" + preco);
    }

    public void exibirDetalhes() {
        System.out.printf("Caminhão - Modelo: %s, Marca: %s, Preço: R$ %.2f\n", modelo, marca, preco);
    }

    public double calcularParcela(int meses) {
        double totalComJuros = preco + (preco * TAXA_JUROS);
        return totalComJuros / meses;
    }

    public void exibirCondicoesFinanciamento(int meses) {
        double parcela = calcularParcela(meses);
        System.out.printf("Financiamento Caminhão - Modelo: %s\nParcelas: %d meses, Valor da parcela: R$ %.2f\n",
                modelo, meses, parcela);
    }
}
