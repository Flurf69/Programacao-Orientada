public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario<=0) {
            throw new IllegalArgumentException("Salario deve ser maior que 0");
        }
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public double calcularIrfp(){
        double temp;
        if(salario<= 1903.98){
            return 0;
        }
        if (salario>1903.98 && salario <=2826.66){
            temp = salario*0.075;
             return salario-=temp;
        }
        if (salario>2826.66){
            temp = salario*0.15;
            return salario-=temp;
        }
        return salario;
    }

    public FaixaIrfp identificarFaixaIrfp(){
        if(salario<= 1903.98){
            return FaixaIrfp.PRIMEIRA;
        }
        if (salario>1903.98 && salario <=2826.66) {
            return FaixaIrfp.SEGUNDA;
        }
        if (salario>2826.66){
            return FaixaIrfp.TERCEIRA;
        }
        return null;
    }
}
