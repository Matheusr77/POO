public class carro extends veiculo implements mover{
    private int quantPortas;

    public carro(String nome, double velMax, int quantPortas){
        super(nome, velMax);
        this.quantPortas = quantPortas;
    }

    @Override
    public void exibirInformacao(){
        super.exibirInformacao();
        System.out.println("Quantidade de portas: " + quantPortas);
    }

    public void mover(){
        System.out.println("O carro " + getNome() + " está movendo na direção da ilha.");
    }

    public int getQuantPortas(){
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas){
        this.quantPortas = quantPortas;
    }
    
}
