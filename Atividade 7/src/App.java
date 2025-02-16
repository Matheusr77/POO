import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        String[] opcoes = {"Cadastrar um veículo", "Listar todos os veículos", "Buscar veículo por modelo",
                "Exibir condições de financiamento", "Sair"};

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Gerenciador de Veículos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == 4 || escolha == JOptionPane.CLOSED_OPTION) break;

            switch (escolha) {
                case 0 -> cadastrarVeiculo();
                case 1 -> listarVeiculos();
                case 2 -> buscarVeiculo();
                case 3 -> exibirFinanciamento();
            }
        }
    }

    private static void cadastrarVeiculo() {
        String[] tipos = {"Carro", "Moto", "Caminhão"};
        int tipo = JOptionPane.showOptionDialog(null, "Escolha o tipo de veículo", "Cadastrar Veículo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        if (tipo == JOptionPane.CLOSED_OPTION) return;

        String modelo = JOptionPane.showInputDialog("Modelo:");
        String marca = JOptionPane.showInputDialog("Marca:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço:"));

        switch (tipo) {
            case 0 -> veiculos.add(new Carro(modelo, marca, preco));
            case 1 -> veiculos.add(new Moto(modelo, marca, preco));
            case 2 -> veiculos.add(new Caminhao(modelo, marca, preco));
        }
        JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
    }

    private static void listarVeiculos() {
        if (veiculos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum veículo cadastrado.");
            return;
        }

        StringBuilder detalhes = new StringBuilder("Veículos cadastrados:\n\n");
        for (Veiculo veiculo : veiculos) {
            detalhes.append(veiculo.getModelo()).append(" - ").append(veiculo.getMarca()).append(" - R$ ")
                    .append(String.format("%.2f", veiculo.getPreco())).append("\n");
        }
        JOptionPane.showMessageDialog(null, detalhes.toString());
    }

    private static void buscarVeiculo() {
        String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                JOptionPane.showMessageDialog(null, "Veículo encontrado:\n");
                veiculo.exibirDetalhes();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
    }

    private static void exibirFinanciamento() {
        String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo:");
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Número de meses para financiamento:"));

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                if (veiculo instanceof Financiavel financiavel) {
                    financiavel.exibirCondicoesFinanciamento(meses);
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Veículo não encontrado ou não financiável.");
    }
}
