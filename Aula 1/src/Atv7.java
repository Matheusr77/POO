import javax.swing.JOptionPane;

public class Atv7 {
    public static void main(String[] args) {
            
        String hora1 = JOptionPane.showInputDialog(null, "Digite quantas horas você trabalhou no mês: ", "CÁLCULO SALÁRIO", JOptionPane.QUESTION_MESSAGE);
        String valorHora1 = JOptionPane.showInputDialog(null, "Digite o valor da hora trabalhada: ", "CÁLCULO SALÁRIO", JOptionPane.QUESTION_MESSAGE);
        String dependente1 = JOptionPane.showInputDialog(null, "Digite quantos dependente você tem: ", "CÁLCULO SALÁRIO", JOptionPane.QUESTION_MESSAGE);
        String descontos1 = JOptionPane.showInputDialog(null, "Digite o valor dos descontos: ", "CÁLCULO SALÁRIO", JOptionPane.QUESTION_MESSAGE);

        int hora = Integer.parseInt(hora1);
        float valorHora = Float.parseFloat(valorHora1);
        int dependente = Integer.parseInt(dependente1);
        float descontos = Float.parseFloat(descontos1);

        double salario = ((hora * valorHora) + (50 * dependente) - descontos);

        JOptionPane.showMessageDialog(null, "Seu salário final é: " + salario, "SALÁRIO FINAL", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
