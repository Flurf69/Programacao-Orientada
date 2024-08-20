package numero3;
public class Pessoa {

    public double altura;
    public double peso;
    public String nome;

    public double calcularImc(){
        
        return peso/Math.pow(altura, 2);
    }
    
}
