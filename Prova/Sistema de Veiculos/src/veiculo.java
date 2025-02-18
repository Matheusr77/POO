abstract class veiculo{
    private String nome;
    private double velMax;


    public veiculo(String nome, double velMax){
        this.nome = nome;
        this.velMax = velMax;
    }

    public void exibirInformacao(){
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade Máxima: " + velMax + " KM");
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelMax(){
        return velMax;
    }

    public void setVelMax(double velMax){
        this.velMax = velMax;
    }

}