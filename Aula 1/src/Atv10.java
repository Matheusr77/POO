import javax.swing.JOptionPane;

public class Atv10 {

    public static void areaQuadrado(){
        String base1 = JOptionPane.showInputDialog(null, "Digite a medida da base: ", "QUADRADO", JOptionPane.QUESTION_MESSAGE);
        String altura1 = JOptionPane.showInputDialog(null, "Digite a medida da altura: ", "QUADRADO", JOptionPane.QUESTION_MESSAGE);
        double base = Double.parseDouble(base1);
        double altura = Double.parseDouble(altura1);
        double area = base * altura;
        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + String.format("%.2f", area), "ÁREA DO QUADRADO", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void areaCirculo(){
        String raio1 = JOptionPane.showInputDialog(null, "Digite a medida do raio: ", "CÍRCULO", JOptionPane.QUESTION_MESSAGE);
        double raio = Double.parseDouble(raio1);
        double area = 3.14 * Math.pow(raio, 2);
        JOptionPane.showMessageDialog(null, "A área do círculo é: " + String.format("%.2f", area), "ÁREA DO CÍRCULO", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void areaTriangulo(){
        String base1 = JOptionPane.showInputDialog(null, "Digite a medida da base: ", "TRIÂNGULO", JOptionPane.QUESTION_MESSAGE);
        String altura1 = JOptionPane.showInputDialog(null, "Digite a medida da altura: ", "TRIÂNGULO", JOptionPane.QUESTION_MESSAGE);
        double base = Double.parseDouble(base1);
        double altura = Double.parseDouble(altura1);
        double area = ((base * altura) / 2);
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + String.format("%.2f", area), "ÁREA DO TRIÂNGULO", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {

        while (true) { 
            String[] opcoes = {"Calcular Área do Quadrado", "Calcular Área do Círculo", "Calcular Área do Triângulo", "Sair"};

            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    areaQuadrado();
                    break;

                case 1:
                    areaCirculo();
                    break;

                case 2:
                    areaTriangulo();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
        
    }
    
}
