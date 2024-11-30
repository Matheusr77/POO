public class Funcionario {

    private String nome;
    private String cpf;
    private Cargo funcao;

    public Funcionario(String nome, String cpf, Cargo funcao){
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public Cargo getFuncao(){
        return funcao;
    }

    public void setFuncao(Cargo funcao){
        this.funcao = funcao;
    }
}
