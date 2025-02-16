import javax.swing.JOptionPane;

public class Onibus implements Transporte, Compartilhavel {
    private double custoPorKmPorPassageiro;
    private int lugaresTotais;
    private int lugaresOcupados;

    public Onibus(double custoPorKmPorPassageiro, int lugaresTotais) {
        this.custoPorKmPorPassageiro = custoPorKmPorPassageiro;
        this.lugaresTotais = lugaresTotais;
        this.lugaresOcupados = 0;
    }

    @Override
    public void iniciar() {
        JOptionPane.showMessageDialog(null, "Iniciando ônibus.");
    }

    @Override
    public void parar() {
        JOptionPane.showMessageDialog(null, "Parando ônibus.");
    }

    @Override
    public double calcularCusto(double distancia) {
        return distancia * custoPorKmPorPassageiro * (lugaresTotais - calcularLugaresDisponiveis());
    }

    @Override
    public int calcularLugaresDisponiveis() {
        return lugaresTotais - lugaresOcupados;
    }
}
