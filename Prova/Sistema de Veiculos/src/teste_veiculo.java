import java.util.Scanner;

public class teste_veiculo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do carro: ");
        String nome = sc.nextLine();

        System.out.println("Velocidade Máxima: ");
        double velMax = sc.nextDouble();

        System.out.println("Quantidade de portas: ");
        int quantPortas = sc.nextInt();

        sc.nextLine();

        carro carro = new carro(nome, velMax, quantPortas);
        
        System.out.println("Nome da moto: ");
        String nomeMoto = sc.nextLine();

        System.out.println("Velocidade Máxima: ");
        double velMaxMoto = sc.nextDouble();

        sc.nextLine();

        System.out.println("Tipo de guidão: ");
        String tipoGuidao = sc.nextLine();

        moto moto = new moto(nomeMoto, velMaxMoto, tipoGuidao);

        System.out.println("Nome do caminhão: ");
        String nomeCAM = sc.nextLine();

        System.out.println("Velocidade Máxima: ");
        double velMaxCAM = sc.nextDouble();

        sc.nextLine();

        System.out.println("Capacidade de carga: ");
        double capacidadeCarga = sc.nextDouble();

        caminhao caminhao = new caminhao(nomeCAM, velMaxCAM, capacidadeCarga);

        System.out.println("\nInforamções Carro\n");
        carro.exibirInformacao();
        carro.mover();

        System.out.println("\nInforamções Moto\n");
        moto.exibirInformacao();
        moto.mover();

        System.out.println("\nInformações Caminhão\n");
        caminhao.exibirInformacao();
        caminhao.mover();

    }
    
}
