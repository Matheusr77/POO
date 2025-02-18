public class caminhao extends veiculo implements mover{

    private double capacidadeCarga;

    public caminhao(String nome, double velMax, double capacidadeCarga){
        super(nome, velMax);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirInformacao(){
        super.exibirInformacao();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }

    public void mover(){
        System.out.println("O caminhão " + getNome() + " está movendo na direção da ilha.");
    }

    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
    
}
