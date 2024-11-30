import javax.swing.JOptionPane;

public class Produto {

    private int codigo;
    private String nome;

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void cadastroProduto(int codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
        JOptionPane.showMessageDialog(null, "Produto cadastrado!", 
        "CADASTRO DO PRODUTO", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cadastroServico(int codigo,String nome){
        this.codigo = codigo;
        this.nome = nome;
        JOptionPane.showMessageDialog(null, "Serviço cadastrado!", 
        "CADASTRO DO SERVIÇO", JOptionPane.INFORMATION_MESSAGE);
    }
}
