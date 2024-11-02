import javax.swing.JOptionPane;

public class Aula1 {
    public static void main(String[] args) {
        
        int[][] mat1 = new int [3][3];
        int[][] mat2 = new int [3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                String valor = JOptionPane.showInputDialog("Informe o valor para a posição [" + i + "][" + j + "] da Matriz 1:", JOptionPane.QUESTION_MESSAGE); 
                mat1[i][j] = Integer.parseInt(valor); 

            }
        } 

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                String valor = JOptionPane.showInputDialog("Informe o valor para a posição [" + i + "][" + j + "] da Matriz 2:", JOptionPane.QUESTION_MESSAGE); 
                mat2[i][j] = Integer.parseInt(valor); 

            }
        } 

        for(int i = 0; i < 3; i++){
            for(int j = 0; i < 3; j++){
                JOptionPane.showMessageDialog(null," %d" + mat1[i][j], "Matriz 1", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    
}
