import javax.swing.JOptionPane;
import java.util.Random;

public class Atv11 {

    public static int aleat() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Gera um número entre 1 e 100
    }
    public static void main(String[] args) {

        int num = aleat();
        int escolha = 0;
        int tentativas = 0;


        while (escolha != num) {

            String escolha1 = JOptionPane.showInputDialog(null, "Tente adivinhar o número de 1 a 100: ", "ADIVINHAÇÃO", JOptionPane.QUESTION_MESSAGE);
            escolha = Integer.parseInt(escolha1);
            tentativas++;

            if (escolha > num) {
               JOptionPane.showMessageDialog(null, "O número é menor que " + escolha, "ADIVINHAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (escolha < num) {
                JOptionPane.showMessageDialog(null, "O número é maior que " + escolha, "ADIVINHAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (escolha == num) {
                JOptionPane.showMessageDialog(null, "Parabéns, número certo!" + "\nVocê acertou em " + tentativas + " tentativas", "ADIVINHAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }
        }     
    }
}
