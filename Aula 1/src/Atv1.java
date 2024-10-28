import java.util.Scanner;
import javax.swing.JOptionPane;

public class Atv1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", "SEU NOME", JOptionPane.QUESTION_MESSAGE);
        String idade1 = JOptionPane.showInputDialog(null, "Digite a sua idade: ", "SUA IDADE", JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.parseInt(idade1);

        JOptionPane.showMessageDialog(null, nome + ", sua idade é: " + idade, "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);

        scanner.close();
    }
}

