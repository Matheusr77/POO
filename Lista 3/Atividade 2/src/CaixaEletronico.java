import javax.swing.*;
import java.util.ArrayList;

public class CaixaEletronico {
    private static ArrayList<ContaBancaria> contas = new ArrayList<>();

    public static void main(String[] args) {
        String[] opcoes = {
            "Criar conta corrente",
            "Criar conta poupança",
            "Sacar",
            "Depositar",
            "Verificar Saldo",
            "Sair"
        };

        int opcao;

        do {
            opcao = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Caixa Eletrônico",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch (opcao) {
                case 0 -> criarContaCorrente();
                case 1 -> criarContaPoupanca();
                case 2 -> sacar();
                case 3 -> depositar();
                case 4 -> verificarSaldo();
                case 5 -> JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 5);
    }

    private static void criarContaCorrente() {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            String senha = JOptionPane.showInputDialog("Digite a senha da conta:");
            double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite do cheque especial:"));

            ContaCorrente conta = new ContaCorrente(senha, numero, limite);
            contas.add(conta);
            JOptionPane.showMessageDialog(null, "Conta Corrente criada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar conta corrente.");
        }
    }

    private static void criarContaPoupanca() {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            String senha = JOptionPane.showInputDialog("Digite a senha da conta:");
            double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de rendimento:"));

            ContaPoupanca conta = new ContaPoupanca(senha, numero, taxa);
            contas.add(conta);
            JOptionPane.showMessageDialog(null, "Conta Poupança criada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar conta poupança.");
        }
    }

    private static void sacar() {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            String senha = JOptionPane.showInputDialog("Digite a senha da conta:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));

            ContaBancaria conta = encontrarConta(numero, senha);
            if (conta != null) {
                if (conta.saca(valor)) {
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar saque.");
        }
    }

    private static void depositar() {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));

            ContaBancaria conta = encontrarConta(numero);
            if (conta != null) {
                conta.deposita(valor);
                JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar depósito.");
        }
    }

    private static void verificarSaldo() {
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            String senha = JOptionPane.showInputDialog("Digite a senha da conta:");

            ContaBancaria conta = encontrarConta(numero, senha);
            if (conta != null) {
                JOptionPane.showMessageDialog(null, conta.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar saldo.");
        }
    }

    private static ContaBancaria encontrarConta(int numero, String senha) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero && conta.getSenha().equals(senha)) {
                return conta;
            }
        }
        JOptionPane.showMessageDialog(null, "Conta não encontrada ou senha incorreta.");
        return null;
    }

    private static ContaBancaria encontrarConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        JOptionPane.showMessageDialog(null, "Conta não encontrada.");
        return null;
    }
}
