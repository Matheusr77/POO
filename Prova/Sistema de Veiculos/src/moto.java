public class moto extends veiculo implements mover{
    private String tipoGuidao;
    
    public moto(String nome, double velMax, String tipoGuidao){
        super(nome, velMax);
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public void exibirInformacao(){
        super.exibirInformacao();
        System.out.println("Tipo de Guidão: " + tipoGuidao);
    }

    public void mover(){
        System.out.println("A moto " + getNome() + " está movendo na direção da ilha.");
    }

    public String getTipoGuidao(){
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao){
        this.tipoGuidao = tipoGuidao;
    }
}
