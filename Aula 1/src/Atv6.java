import javax.swing.JOptionPane;;

public class Atv6 {
    public static void main(String[] args) {

        int opcao;
        
        do {

            String km1 = JOptionPane.showInputDialog(null, "Digite quantos KM foi percorrido: ", "QUILOMETRAGEM", JOptionPane.QUESTION_MESSAGE);
            String litros1 = JOptionPane.showInputDialog(null, "Digite quantos litros de combustível foram gastos: ", "COMBUSTÍVEL", JOptionPane.QUESTION_MESSAGE);
    
            int km = Integer.parseInt(km1);
            int litros = Integer.parseInt(litros1);
    
            int resultado = km / litros;

            JOptionPane.showMessageDialog(null, "Este veículo faz " + resultado + " KM por litro", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
            
            opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar um novo cálculo? ");

        } while (opcao == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Muito Obrigado!", "PROGRAMA ENCERRADO", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
