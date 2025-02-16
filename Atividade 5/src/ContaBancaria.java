public abstract class ContaBancaria {
    private String senha;
    private String numero;
    protected double saldo;

    public ContaBancaria(String numero, String senha) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = 0.0; // Saldo inicial
    }

    public String getSenha() {
        return senha;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public abstract boolean saca(double valor);

    public void deposita(double valor) {
        saldo += valor;
    }
}
