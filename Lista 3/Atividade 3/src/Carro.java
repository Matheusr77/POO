import javax.swing.JOptionPane;

public class Carro implements Transporte, Compartilhavel {
    private double consumoPorKm; // Consumo de combustível (litros por km)
    private double precoCombustivel; // Preço do combustível por litro
    private int lugaresTotais;
    private int lugaresOcupados;

    public Carro(double consumoPorKm, double precoCombustivel, int lugaresTotais) {
        this.consumoPorKm = consumoPorKm;
        this.precoCombustivel = precoCombustivel;
        this.lugaresTotais = lugaresTotais;
        this.lugaresOcupados = 0;
    }

    @Override
    public void iniciar() {
        JOptionPane.showMessageDialog(null, "Iniciando carro.");
    }

    @Override
    public void parar() {
        JOptionPane.showMessageDialog(null, "Parando carro.");
    }

    @Override
    public double calcularCusto(double distancia) {
        return distancia * consumoPorKm * precoCombustivel;
    }

    @Override
    public int calcularLugaresDisponiveis() {
        return lugaresTotais - lugaresOcupados;
    }
}
