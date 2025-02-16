import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<Midia> midias = new ArrayList<>();

    public static void main(String[] args) {
        String[] opcoes = {"Cadastrar uma mídia", "Listar todas as mídias", "Buscar mídia por título", "Reproduzir uma mídia", "Sair"};

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Gerenciador de Mídias",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            if (escolha == 4 || escolha == JOptionPane.CLOSED_OPTION) break;

            switch (escolha) {
                case 0 -> cadastrarMidia();
                case 1 -> listarMidias();
                case 2 -> buscarMidia();
                case 3 -> reproduzirMidia();
            }
        }
    }

    private static void cadastrarMidia() {
        String[] tipos = {"Música", "Vídeo", "Podcast"};
        int tipo = JOptionPane.showOptionDialog(null, "Escolha o tipo de mídia", "Cadastrar Mídia",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipos, tipos[0]);

        if (tipo == JOptionPane.CLOSED_OPTION) return;

        String titulo = JOptionPane.showInputDialog("Título:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));

        switch (tipo) {
            case 0 -> {
                String artista = JOptionPane.showInputDialog("Artista:");
                String album = JOptionPane.showInputDialog("Álbum:");
                midias.add(new Musica(titulo, ano, artista, album));
            }
            case 1 -> {
                String diretor = JOptionPane.showInputDialog("Diretor:");
                int duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração (em minutos):"));
                midias.add(new Video(titulo, ano, diretor, duracao));
            }
            case 2 -> {
                String anfitriao = JOptionPane.showInputDialog("Anfitrião:");
                int episodio = Integer.parseInt(JOptionPane.showInputDialog("Número do episódio:"));
                midias.add(new Podcast(titulo, ano, anfitriao, episodio));
            }
        }
        JOptionPane.showMessageDialog(null, "Mídia cadastrada com sucesso!");
    }

    private static void listarMidias() {
        if (midias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma mídia cadastrada.");
            return;
        }

        StringBuilder detalhes = new StringBuilder("Mídias cadastradas:\n\n");
        for (Midia midia : midias) {
            detalhes.append("-----\n");
            if (midia instanceof Musica) {
                detalhes.append("Tipo: Música\n");
            } else if (midia instanceof Video) {
                detalhes.append("Tipo: Vídeo\n");
            } else if (midia instanceof Podcast) {
                detalhes.append("Tipo: Podcast\n");
            }
            detalhes.append("Título: ").append(midia.getTitulo()).append("\nAno: ").append(midia.getAno()).append("\n");
        }
        JOptionPane.showMessageDialog(null, detalhes.toString());
    }

    private static void buscarMidia() {
        String titulo = JOptionPane.showInputDialog("Digite o título da mídia:");
        for (Midia midia : midias) {
            if (midia.getTitulo().equalsIgnoreCase(titulo)) {
                JOptionPane.showMessageDialog(null, "Mídia encontrada:\n");
                midia.exibirDetalhes();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Mídia não encontrada.");
    }

    private static void reproduzirMidia() {
        String titulo = JOptionPane.showInputDialog("Digite o título da mídia:");
        for (Midia midia : midias) {
            if (midia.getTitulo().equalsIgnoreCase(titulo)) {
                midia.reproduzir();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Mídia não encontrada.");
    }
}
