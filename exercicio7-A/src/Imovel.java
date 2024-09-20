public class Imovel {

    String endereco;
    int area;
    Finalidade finalidade;
    Bairro bairro;

    public Imovel(){

    }

    public Imovel(String endereco,int area,Finalidade finalidade, Bairro bairro){
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        if(area<=0){
            throw new IllegalArgumentException("Area invalida");
        }
        this.area = area;
    }
    public Finalidade getFinalidade() {
        return finalidade;
    }
    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    public Bairro getBairro() {
        return bairro;
    }
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    public double calcularIptu(){
        if(bairro==null){
            throw new IllegalArgumentException("Bairro invalido");
        }
        if(bairro.getCoeficienteIptu() < 0){
            throw new IllegalArgumentException("Coeficiente invalido");
        }
        if(finalidade==null){
            throw new IllegalArgumentException("Finalidade invalida");
        }
        if(area <= 0){
            throw new IllegalArgumentException("Area invalida");
        }

        switch(finalidade){
            case RESIDENCIAL:
                return area*bairro.getCoeficienteIptu();
            case COMERCIAL:
                if(area <= 100){
                    return 500*bairro.getCoeficienteIptu();
                }
                if(area > 100 && area <=400 ){
                    return 1000*bairro.getCoeficienteIptu();
                }
                return (area*2.55)*bairro.getCoeficienteIptu();

            case INDUSTRIAL:
                if (area <= 2000){
                    return 1000*bairro.getCoeficienteIptu();
                }
                if(area>2000){
                    return (area*0.55)*bairro.getCoeficienteIptu();
                }
        }
        return 0;
    }
}
