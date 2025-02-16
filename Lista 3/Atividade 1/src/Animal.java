public class Animal {
    private int id;
    private String nome;
    private String especie;

    public Animal(int id, String nome, String especie) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Espécie: " + especie;
    }
}
