public class ContaCorrente extends ContaBancaria {
    private int transacoes;
    private double limiteChequeEspecial;

    public ContaCorrente(String senha, int numero, double limiteChequeEspecial) {
        super(senha, numero);
        this.transacoes = 0;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public int getTransacoes() {
        return transacoes;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public boolean saca(double valor) {
        if (getSaldo() - valor >= -limiteChequeEspecial) {
            setSaldo(getSaldo() - valor);
            transacoes++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLimite Cheque Especial: " + limiteChequeEspecial + "\nTransações: " + transacoes;
    }
}
