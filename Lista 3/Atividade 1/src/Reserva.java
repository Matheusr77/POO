import javax.swing.*;
import java.util.ArrayList;

public class Reserva {
    private static ArrayList<Animal> listaAnimais = new ArrayList<>();
    private static ArrayList<Localizacao> listaLocalizacoes = new ArrayList<>();

    public static void main(String[] args) {
        String[] opcoes = {
            "Inserir animal",
            "Excluir animal",
            "Inserir localização de animal",
            "Procurar localização de animal",
            "Sair"
        };
        int opcao;

        do {
            opcao = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            switch (opcao) {
                case 0 -> inserirAnimal();
                case 1 -> excluirAnimal();
                case 2 -> inserirLocalizacao();
                case 3 -> procurarLocalizacao();
                case 4 -> JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 4);
    }

    private static void inserirAnimal() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal:"));
            String nome = JOptionPane.showInputDialog("Digite o nome do animal:");
            String especie = JOptionPane.showInputDialog("Digite a espécie do animal:");

            Animal animal = new Animal(id, nome, especie);
            listaAnimais.add(animal);
            JOptionPane.showMessageDialog(null, "Animal inserido com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido.");
        }
    }

    private static void excluirAnimal() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal a ser excluído:"));
            Animal animalRemover = null;

            for (Animal animal : listaAnimais) {
                if (animal.getId() == id) {
                    animalRemover = animal;
                    break;
                }
            }

            if (animalRemover != null) {
                listaAnimais.remove(animalRemover);
                JOptionPane.showMessageDialog(null, "Animal removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Animal não encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido.");
        }
    }

    private static void inserirLocalizacao() {
        try {
            int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal:"));

            boolean animalExiste = listaAnimais.stream().anyMatch(a -> a.getId() == idAnimal);
            if (!animalExiste) {
                JOptionPane.showMessageDialog(null, "Animal não encontrado. Insira um animal antes de adicionar localização.");
                return;
            }

            double latitude = Double.parseDouble(JOptionPane.showInputDialog("Digite a latitude:"));
            double longitude = Double.parseDouble(JOptionPane.showInputDialog("Digite a longitude:"));

            Localizacao localizacao = new Localizacao(idAnimal, latitude, longitude);
            listaLocalizacoes.add(localizacao);
            JOptionPane.showMessageDialog(null, "Localização inserida com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dados inválidos.");
        }
    }

    private static void procurarLocalizacao() {
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal:"));
            Animal animal = null;

            for (Animal a : listaAnimais) {
                if (a.getId() == id) {
                    animal = a;
                    break;
                }
            }

            if (animal == null) {
                JOptionPane.showMessageDialog(null, "Animal não encontrado.");
                return;
            }

            StringBuilder resultado = new StringBuilder();
            resultado.append("Dados do Animal:\n").append(animal).append("\n\nLocalizações:\n");

            listaLocalizacoes.stream()
                .filter(loc -> loc.getIdAnimal() == id)
                .forEach(loc -> resultado.append(loc).append("\n"));

            JOptionPane.showMessageDialog(null, resultado.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido.");
        }
    }
}
