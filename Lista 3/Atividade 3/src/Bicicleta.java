import javax.swing.JOptionPane;

public class Bicicleta implements Transporte {
    private int tempoDeUso; // Tempo total de uso em minutos

    public Bicicleta() {
        this.tempoDeUso = 0;
    }

    @Override
    public void iniciar() {
        JOptionPane.showMessageDialog(null, "Iniciando bicicleta.");
    }

    @Override
    public void parar() {
        JOptionPane.showMessageDialog(null, "Parando bicicleta.");
    }

    @Override
    public double calcularCusto(double distancia) {
        return 0.0; // Bicicleta é gratuita
    }

    public void registrarTempoDeUso(int minutos) {
        this.tempoDeUso += minutos;
    }

    public int getTempoDeUso() {
        return tempoDeUso;
    }
}
