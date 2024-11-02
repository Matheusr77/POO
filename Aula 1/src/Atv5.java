import javax.swing.JOptionPane;

public class Atv5 {

    
    public static double delta(int a, int b, int c){

        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public static double raiz1(int a, int b, double delta){

        double raiz =(-b + (Math.sqrt(delta))) / (2 * a);
        return raiz;
    }

    public static double raiz2(int a, int b, double delta){

        double raiz =(- b - (Math.sqrt(delta))) / (2 * a);
        return raiz;
    }
    public static void main(String[] args) {

        int opcao;

        do {

            String a1 = JOptionPane.showInputDialog(null, "Digite o parâmetro a: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE);
            String b1 = JOptionPane.showInputDialog(null, "Digite o parâmetro b: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE);
            String c1 = JOptionPane.showInputDialog(null, "Digite o parâmetro c: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE);
    
            int a = Integer.parseInt(a1);
            int b = Integer.parseInt(b1);
            int c = Integer.parseInt(c1);
            
            double delta = delta(a, b, c);

            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.", "RESULTADO DA EQUAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            } 
            else {

                double raiz1 = raiz1(a, b, delta);
                double raiz2 = raiz2(a, b, delta);

                JOptionPane.showMessageDialog(null, "Raiz 1: " + raiz1 + "\nRaiz 2: " + raiz2, "RESULTADO DA EQUAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }

            opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova operção? ");
            
        } while (opcao == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Muito Obrigado!", "PROGRAMA ENCERRADO", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
