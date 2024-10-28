import java.util.Scanner;
import javax.swing.JOptionPane;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valor1 = JOptionPane.showInputDialog(null, "Digite o valor que vai ser aplicado: ", "VALOR", JOptionPane.QUESTION_MESSAGE);
        String taxa1 = JOptionPane.showInputDialog(null, "Digite a taxa de juros: ", "TAXA", JOptionPane.QUESTION_MESSAGE); 
        String meses1 = JOptionPane.showInputDialog(null,"Quantos meses vai ficar aplicado: ", "MESES", JOptionPane.QUESTION_MESSAGE);

        float valor = Float.parseFloat(valor1);
        float taxa = Float.parseFloat(taxa1) / 100;
        int meses = Integer.parseInt(meses1);

        double resultado = valor * Math.pow(1 + taxa, meses);

        JOptionPane.showMessageDialog(null, "O valor após " + meses + " meses será: " + String.format("%.2f", resultado), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);

        scanner.close();
    }
    
}
