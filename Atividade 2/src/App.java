package src;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

    int opcao;

    Problemas problemas = new Problemas();    

    do{

       opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Número Primo" + "\n2 - Número Perfeito" + "\n3 - Fatorial" + 
        "\n4 - Fibonacci" + "\n5 - Equação de 2º Grau" + "\n6 - Sair", "MENU", JOptionPane.QUESTION_MESSAGE));

        switch (opcao) {

            case 1:

            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "NÚMERO PRIMO", JOptionPane.QUESTION_MESSAGE));

            int ehprimo = problemas.primo(num);

            if (ehprimo == 1) {
                JOptionPane.showMessageDialog(null, "Este número é primo!", "NÚMERO PRIMO", JOptionPane.INFORMATION_MESSAGE);
            }

            else{
                JOptionPane.showMessageDialog(null, "Este número não é primo!", "NÚMERO PRIMO", JOptionPane.INFORMATION_MESSAGE);
            }
                
            break;

            case 2:

            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "NÚMERO PERFEITO", JOptionPane.QUESTION_MESSAGE));

            boolean perfeito = problemas.perfeito(num1);

            if (perfeito == true) {
                JOptionPane.showMessageDialog(null, "Este número é perfeito!", "NÚMERO PERFEITO", JOptionPane.INFORMATION_MESSAGE);
            }

            else{
                JOptionPane.showMessageDialog(null, "Este número não é perfeito!", "NÚMERO PERFEITO", JOptionPane.INFORMATION_MESSAGE);
            }

            break;

            case 3:

            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "FATORIAL", JOptionPane.QUESTION_MESSAGE));

            int resultados = problemas.fatorial(num2);

            JOptionPane.showMessageDialog(null, "O fatorial de " + num2 + " é: " + resultados, "FATORIAL", JOptionPane.INFORMATION_MESSAGE);

            break;

            case 4:

            int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "FIBONACCI", JOptionPane.QUESTION_MESSAGE));

            int fibonacci = problemas.fibonacci(num3);

            JOptionPane.showMessageDialog(null, "A sequência de Fibonacci é: " + fibonacci, "FIBONACCI", JOptionPane.INFORMATION_MESSAGE);
            
            break;

            case 5:

            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o parâmetro a: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o parâmetro b: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE));
            double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o parâmetro c: ", "EQUAÇÃO DE 2º GRAU", JOptionPane.QUESTION_MESSAGE));

            problemas.equacao(a, b, c);

            break;

            case 6:

                JOptionPane.showMessageDialog(null, "Programa Encerrado!", "MENU", JOptionPane.INFORMATION_MESSAGE);

            break;
        
            default:
                break;
        }


    } while(opcao != 6);
}
}