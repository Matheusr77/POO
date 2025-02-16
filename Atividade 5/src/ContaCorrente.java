public class ContaCorrente extends ContaBancaria {
    private int transacoes;
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String senha, double limiteChequeEspecial) {
        super(numero, senha);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.transacoes = 0;
    }

    public int getTransacoes() {
        return transacoes;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public boolean saca(double valor) {
        if (saldo - valor >= -limiteChequeEspecial) {
            saldo -= valor;
            transacoes++;
            return true;
        }
        return false; // Saldo insuficiente
    }
}
