import javax.swing.JOptionPane;

public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        String[] opcoes = {"À vista", "Parcelado"};
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a forma de pagamento:",
                "Pagamento com Cartão",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (escolha == 0) { // À vista
            double valorComDesconto = valor * 0.85; // Aplicar 15% de desconto
            JOptionPane.showMessageDialog(null, "Pagamento à vista processado com sucesso.\nValor original: R$ "
                    + String.format("%.2f", valor) + "\nValor com desconto: R$ " + String.format("%.2f", valorComDesconto));
        } else if (escolha == 1) { // Parcelado
            int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas (1 a 12):"));
            if (parcelas < 1 || parcelas > 12) {
                JOptionPane.showMessageDialog(null, "Número de parcelas inválido.");
                return;
            }
            calcularParcelas(parcelas);
        }
    }

    private void calcularParcelas(int parcelas) {
        double valorParcela = valor / parcelas;
        JOptionPane.showMessageDialog(null, "Pagamento parcelado em " + parcelas + "x de R$ " +
                String.format("%.2f", valorParcela) + ".\nValor total: R$ " + String.format("%.2f", valor));
    }
}
