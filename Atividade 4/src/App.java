import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Mercadoria[] mercadorias = new Mercadoria[10];
        Servico[] servicos = new Servico[10];
        int mercadoriaCont = 0;
        int servicoCont = 0;

        String[] opcoes = {"Cadastrar mercadoria", "Cadastrar serviços", 
        "Buscar dados de mercadorias", "Buscar dados de serviços", "Sair"};
        int escolha;

        do {

            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "MENU",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:

                    if (mercadoriaCont < 10) {

                        Mercadoria mercadoria = new Mercadoria();

                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Digite o código da mercadoria: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE));;

                        String nome = JOptionPane.showInputDialog(null, "Digite o nome da mercadoria: ",
                        "CADASTRO", JOptionPane.QUESTION_MESSAGE);                      

                        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso da mercadoria: ",
                        "CADASTRO", JOptionPane.QUESTION_MESSAGE));
                        mercadoria.setPeso(peso);

                        mercadoria.cadastroProduto(codigo, nome);
                        mercadorias[mercadoriaCont] = mercadoria;
                        mercadoriaCont++;
                    }

                    break;
            
                case 1:

                    if (servicoCont < 10) {

                        Servico servico = new Servico();

                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Digite o código do serviço: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE));;

                        String nome = JOptionPane.showInputDialog(null, "Digite o nome do serviço: ",
                        "CADASTRO", JOptionPane.QUESTION_MESSAGE);                    

                        double valorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da hora do serviço: ",
                        "CADASTRO", JOptionPane.QUESTION_MESSAGE));
                        servico.setValorHora(valorHora);

                        servico.cadastroServico(codigo, nome);
                        servicos[servicoCont] = servico;
                        servicoCont++;
                    }
                    
                    break;

                case 2:

                    String busca = JOptionPane.showInputDialog(null, "Digite o nome da mercadoria: ", 
                    "BUSCA DADOS", JOptionPane.QUESTION_MESSAGE);

                    for(int i = 0; i < 10; i++){

                        if (mercadorias[i].getNome().equalsIgnoreCase(busca)) {

                            JOptionPane.showMessageDialog(null, 
                            "Código: " + mercadorias[i].getCodigo() + 
                            "\nNome: " + mercadorias[i].getNome() + 
                            "\nPeso: " + mercadorias[i].getPeso(), "RESULTADO DA BUSCA", JOptionPane.INFORMATION_MESSAGE);

                            return; 
                        }
                    }

                        break;

                case 3:

                    String busca2 = JOptionPane.showInputDialog(null, "Digite o nome do serviço: ", 
                    "BUSCA DADOS", JOptionPane.QUESTION_MESSAGE);

                    for(int i = 0; i < 10; i++){

                        if (servicos[i].getNome().equalsIgnoreCase(busca2)) {

                            JOptionPane.showMessageDialog(null, 
                            "Código: " + servicos[i].getCodigo() + 
                            "\nNome: " + servicos[i].getNome() + 
                            "\nValor hora: " + servicos[i].getValorHora(), "RESULTADO DA BUSCA", JOptionPane.INFORMATION_MESSAGE);

                            return;
                        }
                    }

                        break;

                case 4:

                    JOptionPane.showMessageDialog(null, "Programa encerrado!", 
                    "MENU", JOptionPane.INFORMATION_MESSAGE);

                    break;

                default:
                    break;
            }


        } while(escolha != 4);
    }
}
