import javax.swing.JOptionPane;

public class Atv4 {
    public static void main(String[] args) {

        String peso1 = JOptionPane.showInputDialog(null, "Digite seu peso: ", "PESO", JOptionPane.QUESTION_MESSAGE);
        String altura1 = JOptionPane.showInputDialog(null, "Digite sua altura: ", "ALTURA", JOptionPane.QUESTION_MESSAGE);

        float peso = Float.parseFloat(peso1);
        float altura = Float.parseFloat(altura1);

        double imc = peso / Math.pow(altura, 2);
        
    
        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Baixo peso, pois seu IMC é: " + String.format("%.2f", imc), "IMC", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (imc >= 18.6 && imc < 25.9) {
            JOptionPane.showMessageDialog(null, "Saudável, pois seu IMC é: " + String.format("%.2f", imc), "IMC", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (imc >= 25 && imc < 29.9) {
            JOptionPane.showMessageDialog(null, "Peso em excesso, pois seu IMC é: " + String.format("%.2f", imc), "IMC", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (imc >= 30 && imc < 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade grau I, pois seu IMC é: " + String.format("%.2f", imc), "IMC", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (imc >= 35 && imc < 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade grau II, pois seu IMC é: " + String.format("%.2f", imc), "IMC", JOptionPane.INFORMATION_MESSAGE);
        }

        else if (imc > 40) {
            JOptionPane.showMessageDialog(null, "Obesidade mórbida, pois seu IMC é: " + String.format("%.2f", imc), "IMC", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
