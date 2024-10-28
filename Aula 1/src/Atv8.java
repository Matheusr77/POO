import javax.swing.JOptionPane;

public class Atv8 {
    public static void main(String[] args) {
        
        String catetoA1 = JOptionPane.showInputDialog(null, "Digite o valor do primeiro cateto: ", "HIPOTENUSA", JOptionPane.QUESTION_MESSAGE);
        String catetoB1 = JOptionPane.showInputDialog(null, "Digite o valor do segundo cateto: ", "HIPOTENUSA", JOptionPane.QUESTION_MESSAGE);

        double catetoA = Double.parseDouble(catetoA1);
        double catetoB = Double.parseDouble(catetoB1);

        double hipotenusa = (Math.sqrt((Math.pow(catetoA, 2) + Math.pow(catetoB, 2))));

        JOptionPane.showMessageDialog(null, "A hipotenusa é: " + String.format("%.2f", hipotenusa), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
    }
}
