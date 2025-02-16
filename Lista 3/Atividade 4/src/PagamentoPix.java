import javax.swing.JOptionPane;

public class PagamentoPix extends Pagamento {
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        JOptionPane.showMessageDialog(null, "Pagamento via Pix processado com sucesso.\nValor: R$ " + String.format("%.2f", valor));
    }
}
