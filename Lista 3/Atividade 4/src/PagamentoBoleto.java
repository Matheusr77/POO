import javax.swing.JOptionPane;

public class PagamentoBoleto extends Pagamento {
    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        double valorComDesconto = valor * 0.90; // Aplicar 10% de desconto
        JOptionPane.showMessageDialog(null, "Pagamento via Boleto processado com sucesso.\nValor original: R$ "
                + String.format("%.2f", valor) + "\nValor com desconto: R$ " + String.format("%.2f", valorComDesconto));
    }
}
