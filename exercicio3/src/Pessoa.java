public class Pessoa {

    private double salario;
    private String nome;

    public Pessoa(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;

    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome está vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0){
            throw new IllegalArgumentException("numero invalido");
        }
        this.salario = salario;
    }

    public double calcularIrfp(){
        double temp;
        if(getSalario()<=1903.99 && getSalario()>=2826.65){
            temp = getSalario()*0.075;
            this.salario -= temp;
        }
        if (getSalario()<=2826.66 && getSalario()>=3751.05){
            temp = getSalario()*0.15;
            this.salario -= temp;
        }
        if (getSalario()<=3751.06 && getSalario()>=4664.68){
            temp = getSalario()*0.225;
            this.salario -= temp;
        }
        if (getSalario()>=4664.69){
            temp = getSalario()*0.275;
        }
        return salario;
    }
}
