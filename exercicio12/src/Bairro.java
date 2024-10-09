public class Bairro {

    private String nome;
    private double coeficienteIptu;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if(coeficienteIptu >= 0) {
            throw new IllegalArgumentException("Coeficiente do IPTU invalido");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
}
