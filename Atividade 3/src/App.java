import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int cont = 0;

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos funcionários deseja cadastrar? ", 
        "MENU", JOptionPane.QUESTION_MESSAGE));

        Funcionario[] funcionario = new Funcionario[num];

        String[] opcoes = {"Cadastrar Funcionário", "Listar Funcionários", "Buscar Funcionário por Nome", "Sair"};
        int escolha;

        do {

            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {

                case 0:
                    
                    if (cont <= num) {

                        for(int i = 0; i < num; i++){
                            
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
                        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);

                        String titulo = JOptionPane.showInputDialog(null, "Digite a função: ","CADASTRO", JOptionPane.QUESTION_MESSAGE);
                        int salario = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o salário:" , "CADSTRO", JOptionPane.QUESTION_MESSAGE));
                        

                        Cargo cargo = new Cargo(titulo, salario);
                        funcionario[cont] = new Funcionario(nome, cpf, cargo);
                        cont++;

                        JOptionPane.showMessageDialog(null, "Funcionário Cadastrado!", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                        }  
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Limite de funcionário atingido!", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;
                
                case 1:

                    if (cont > 0) {
                        
                        for(int i = 0; i < num; i++){

                            JOptionPane.showMessageDialog(null, 
                            "\nNome: " + funcionario[i].getNome() +
                            "\nCPF: " + funcionario[i].getCPF() +
                            "\nCargo: " + funcionario[i].getFuncao().getTitulo() +
                            "\nSalário: " + funcionario[i].getFuncao().getSalario(), 
                            "LISTA DE FUNCIONÁRIOS", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    
                    else{
                        JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!", 
                        "LISTA DE FUNCIONÁRIOS", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;

                case 2:

                    String busca = JOptionPane.showInputDialog(null, "Digite o nome: ", 
                    "BUSCA POR NOME", JOptionPane.QUESTION_MESSAGE);

                    for(int i = 0; i < num; i++){

                        if (funcionario[i].getNome().equalsIgnoreCase(busca)) {
                            JOptionPane.showMessageDialog(null, 
                            "\nNome: " + funcionario[i].getNome() +
                            "\nCPF: " + funcionario[i].getCPF() +
                            "\nCargo: " + funcionario[i].getFuncao().getTitulo() +
                            "\nSalário: " + funcionario[i].getFuncao().getSalario(), 
                            "BUSCA POR NOME", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }

                    break;

                case 3:

                    JOptionPane.showMessageDialog(null, "Programa encerrado!", "MENU",
                    JOptionPane.INFORMATION_MESSAGE);

                    break;

                default:
                    break;
            }

        }while(escolha != 3);
        
    }
}
