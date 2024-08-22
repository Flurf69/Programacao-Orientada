public class Pessoa {

    private double salario;
    private String nome;

    public Pessoa(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
