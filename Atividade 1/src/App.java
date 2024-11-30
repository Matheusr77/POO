import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        int opcao;
        
        do{
        Equacao equacao = new Equacao();

        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de A: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de B: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de C: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE));

        equacao.setA(a);
        equacao.setB(b);
        equacao.setC(c);

        JOptionPane.showMessageDialog(null, "Valor do delta: " + equacao.delta(), "EQUAÇÃO DE 2º GRAU", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Raiz 1: " + String.format("%.2f", equacao.raiz1()) + "\nRaiz 2: " + String.format("%.2f", equacao.raiz2()), "EQUAÇÃO DE 2º GRAU", JOptionPane.INFORMATION_MESSAGE);

        opcao = JOptionPane.showConfirmDialog(null, "Deseja inserir outros valores?", "EQUAÇÃO DE 2º GRAU", JOptionPane.YES_NO_OPTION);
        
        } while(opcao == JOptionPane.YES_OPTION);
    }

}
