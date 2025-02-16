public abstract class ContaBancaria {
    private String senha;
    private int numero;
    private double saldo;

    public ContaBancaria(String senha, int numero) {
        this.senha = senha;
        this.numero = numero;
        this.saldo = 0.0; // Todas as contas começam com saldo zero
    }

    public String getSenha() {
        return senha;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract boolean saca(double valor);

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numero + "\nSaldo: " + saldo;
    }
}
