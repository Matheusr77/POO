import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDePagamentos {
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();
        String[] opcoes = {"Pix", "Boleto", "Cartão", "Processar todos", "Sair"};
        int opcao;

        do {
            opcao = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Gerenciador de Pagamentos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            switch (opcao) {
                case 0 -> adicionarPagamentoPix(pagamentos);
                case 1 -> adicionarPagamentoBoleto(pagamentos);
                case 2 -> adicionarPagamentoCartao(pagamentos);
                case 3 -> processarTodosPagamentos(pagamentos);
                case 4 -> JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 4);
    }

    private static void adicionarPagamentoPix(List<Pagamento> pagamentos) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento via Pix:"));
        pagamentos.add(new PagamentoPix(valor));
        JOptionPane.showMessageDialog(null, "Pagamento via Pix adicionado.");
    }

    private static void adicionarPagamentoBoleto(List<Pagamento> pagamentos) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento via Boleto:"));
        pagamentos.add(new PagamentoBoleto(valor));
        JOptionPane.showMessageDialog(null, "Pagamento via Boleto adicionado.");
    }

    private static void adicionarPagamentoCartao(List<Pagamento> pagamentos) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento com Cartão:"));
        pagamentos.add(new PagamentoCartao(valor));
        JOptionPane.showMessageDialog(null, "Pagamento com Cartão adicionado.");
    }

    private static void processarTodosPagamentos(List<Pagamento> pagamentos) {
        if (pagamentos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há pagamentos para processar.");
            return;
        }
        for (Pagamento pagamento : pagamentos) {
            pagamento.processar();
        }
        pagamentos.clear(); // Limpa a lista após processar
        JOptionPane.showMessageDialog(null, "Todos os pagamentos foram processados.");
    }
}
