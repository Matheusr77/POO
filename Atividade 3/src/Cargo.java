public class Cargo {

    private String titulo;
    private double salario;

    public Cargo(String titulo, double salario){
        this.titulo = titulo;
        this.salario = salario;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
