import javax.swing.JOptionPane;

public class Atv3 {
    public static void main(String[] args) {

        double soma = 0;
        int contador = 0;

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Digite o salário (ou um número negativo para sair): ", "MÉDIA SALARIAL", JOptionPane.QUESTION_MESSAGE);
            double salario = Double.parseDouble(input); // Converte o input para um número decimal

            if (salario < 0) {
                break;
            }

            soma += salario;
            contador++;
        }

        if (contador > 0) {

            double mediaSalarios = soma / contador;
            JOptionPane.showMessageDialog(null, "A média dos salários é: " + String.format("%.2f", mediaSalarios), "MÉDIA SALARIAL", JOptionPane.INFORMATION_MESSAGE);
        } 
        
    }
    
}
