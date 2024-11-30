import javax.swing.JOptionPane;

public class Equacao {

    private double a;
    private double b;
    private double c;

    public void setA(double a){
        this.a = a;
    }

    public double getA(){
        return a;
    }

    public void setB(double b){
        this.b = b;
    }

    public double getB(){
        return b;
    }

    public void setC(double c){
        this.c = c;
    }

    public double getC(){
        return c;
    }

    public double delta(){
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double raiz1(){
        return (-b + Math.sqrt(delta())) / (2 * a);
    }

    public double raiz2(){
        return (-b - Math.sqrt(delta())) / (2 * a);
    }
}


