package src;

import javax.swing.JOptionPane;

public class Problemas {

    // Método para descobrir se um número é primo
    public static int primo(int num){
        if (num <= 1) {
            return -1;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return -1;
            }
        }
        return 1;
    }

    // Método para descobrir se um número é perfeito
    public static boolean perfeito(int num) {
        if (num <= 0) {
            return false;
        }

        int somaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
    }

    // Método para descobrir o fatorial de um número
    public static int fatorial(int num){
        if (num < 0) {
            return -1;
        }

        int fatorial = 1;
        for(int i = 1; i <= num; i++){
            fatorial = fatorial * i;
        }

        return fatorial;
    }

    // Método para calcular a sequência de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, next;
        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void equacao(double a, double b, double c){
        
        double delta = Math.pow(b, 2.0) - 4.0 * a * c;
    
        double raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        
        double raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        
        JOptionPane.showMessageDialog(null, "Delta: " + String.format("%.2f", delta) + "\nRaiz 1: " + String.format("%.2f", raiz1)
        + "\nRaiz 2: " + String.format("%.2f", raiz2), "EQUAÇÃO DE 2º GRAU", JOptionPane.INFORMATION_MESSAGE);

    }


}
