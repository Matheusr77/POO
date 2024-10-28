import javax.swing.JOptionPane;;

public class Atv9 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(int i = 0;i < 10; i++){
            
            String num = JOptionPane.showInputDialog(null, "Digite o número " + (i + 1) + " no vetor: ", "APP", JOptionPane.QUESTION_MESSAGE);
            vetor[i] = Integer.parseInt(num);
        }
        
        StringBuilder resultado = new StringBuilder("Números na ordem inversa:\n");
        for (int i = vetor.length - 1; i >= 0; i--) {
            resultado.append(vetor[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
}
