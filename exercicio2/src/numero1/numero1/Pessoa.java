package numero1.numero1;
public class Pessoa {

    public double altura;
    public double peso;
    public String nome;

    public double calcularImc(){
        
        return peso/Math.pow(altura, 2);
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    
}
