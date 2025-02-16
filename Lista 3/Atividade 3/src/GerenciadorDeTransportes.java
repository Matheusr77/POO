import javax.swing.*;

public class GerenciadorDeTransportes {
    public static void main(String[] args) {
        String[] opcoes = {"Carro", "Bicicleta", "Ônibus", "Sair"};
        int opcao;

        do {
            opcao = JOptionPane.showOptionDialog(
                null,
                "Escolha o tipo de transporte:",
                "Gerenciador de Transportes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch (opcao) {
                case 0 -> gerenciarCarro();
                case 1 -> gerenciarBicicleta();
                case 2 -> gerenciarOnibus();
                case 3 -> JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 3);
    }

    private static void gerenciarCarro() {
        Carro carro = new Carro(0.1, 5.5, 4); // Consumo: 0.1 L/km, Preço combustível: 5.5, 4 lugares
        carro.iniciar();
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida (km):"));
        double custo = carro.calcularCusto(distancia);
        JOptionPane.showMessageDialog(null, "Custo para " + distancia + " km: R$ " + String.format("%.2f", custo));
        JOptionPane.showMessageDialog(null, "Lugares disponíveis: " + carro.calcularLugaresDisponiveis());
        carro.parar();
    }

    private static void gerenciarBicicleta() {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.iniciar();
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de uso (minutos):"));
        bicicleta.registrarTempoDeUso(minutos);
        JOptionPane.showMessageDialog(null, "Custo para usar a bicicleta: Gratuito\nTempo de uso registrado: " + minutos + " minutos.");
        bicicleta.parar();
    }

    private static void gerenciarOnibus() {
        Onibus onibus = new Onibus(1.5, 40); // Custo por km por passageiro: 1.5, 40 lugares
        onibus.iniciar();
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida (km):"));
        double custo = onibus.calcularCusto(distancia);
        int lugaresDisponiveis = onibus.calcularLugaresDisponiveis();
        JOptionPane.showMessageDialog(null, "Custo para " + distancia + " km: R$ " + String.format("%.2f", custo) + "\nLugares disponíveis: " + lugaresDisponiveis);
        onibus.parar();
    }
}
