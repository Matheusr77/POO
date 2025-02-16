public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numero, String senha, double taxaRendimento) {
        super(numero, senha);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public boolean saca(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false; // Saldo insuficiente
    }
}
