import javax.swing.*;
import java.util.ArrayList;

public class App {
    private static ArrayList<ContaBancaria> contas = new ArrayList<>();

    public static void main(String[] args) {
        String[] opcoes = {"Criar Conta Corrente", "Criar Conta Poupança", "Sacar", "Depositar", "Verificar Saldo", "Sair"};

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Caixa Eletrônico",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == 5 || escolha == JOptionPane.CLOSED_OPTION) break;

            switch (escolha) {
                case 0 -> criarContaCorrente();
                case 1 -> criarContaPoupanca();
                case 2 -> sacar();
                case 3 -> depositar();
                case 4 -> verificarSaldo();
            }
        }
    }

    private static void criarContaCorrente() {
        String numero = JOptionPane.showInputDialog("Número da conta:");
        String senha = JOptionPane.showInputDialog("Senha:");
        double limite = Double.parseDouble(JOptionPane.showInputDialog("Limite do cheque especial:"));
        contas.add(new ContaCorrente(numero, senha, limite));
        JOptionPane.showMessageDialog(null, "Conta Corrente criada com sucesso!");
    }

    private static void criarContaPoupanca() {
        String numero = JOptionPane.showInputDialog("Número da conta:");
        String senha = JOptionPane.showInputDialog("Senha:");
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Taxa de rendimento (%):"));
        contas.add(new ContaPoupanca(numero, senha, taxa));
        JOptionPane.showMessageDialog(null, "Conta Poupança criada com sucesso!");
    }

    private static ContaBancaria encontrarConta(String numero, String senha) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getSenha().equals(senha)) {
                return conta;
            }
        }
        return null;
    }

    private static void sacar() {
        String numero = JOptionPane.showInputDialog("Número da conta:");
        String senha = JOptionPane.showInputDialog("Senha:");
        ContaBancaria conta = encontrarConta(numero, senha);

        if (conta != null) {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para sacar:"));
            if (conta.saca(valor)) {
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conta não encontrada ou senha incorreta.");
        }
    }

    private static void depositar() {
        String numero = JOptionPane.showInputDialog("Número da conta:");
        ContaBancaria conta = contas.stream()
                .filter(c -> c.getNumero().equals(numero))
                .findFirst().orElse(null);

        if (conta != null) {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor para depositar:"));
            conta.deposita(valor);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Conta não encontrada.");
        }
    }

    private static void verificarSaldo() {
        String numero = JOptionPane.showInputDialog("Número da conta:");
        String senha = JOptionPane.showInputDialog("Senha:");
        ContaBancaria conta = encontrarConta(numero, senha);

        if (conta != null) {
            String detalhes = String.format("""
                    Número: %s
                    Saldo: %.2f
                    """, conta.getNumero(), conta.getSaldo());
            if (conta instanceof ContaCorrente cc) {
                detalhes += "Limite Cheque Especial: " + cc.getLimiteChequeEspecial();
            } else if (conta instanceof ContaPoupanca cp) {
                detalhes += "Taxa de Rendimento: " + cp.getTaxaRendimento();
            }
            JOptionPane.showMessageDialog(null, detalhes);
        } else {
            JOptionPane.showMessageDialog(null, "Conta não encontrada ou senha incorreta.");
        }
    }
}
