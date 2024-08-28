package numero1;

public class Retangulo {

    private int altura;
    private int comprimento;


    @SuppressWarnings("unused")
    public Retangulo(){
        this.altura = 0;
        this.comprimento = 0;
    }

    public Retangulo(int comprimento, int altura){
        this.altura = altura;
        this.comprimento = comprimento;
    }

    @SuppressWarnings("unused")
    public void setAltura(int altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    @SuppressWarnings("unused")
    public int getAltura() {
        return altura;
    }

    @SuppressWarnings("unused")
    public void setComprimento(int comprimento) {
        if(comprimento <= 0){
            throw new IllegalArgumentException("Comprimento deve ser maior que zero");
        }
        this.comprimento = comprimento;
    }

    @SuppressWarnings("unused")
    public int getComprimento() {
        return comprimento;
    }

    /**
     *
     * @return retorna o perimetro do retangulo fazendo a formula para perimetro (a soma de todos os lados)
     */
    public int calcularPerimetro(){
        return (2*altura)+(2*comprimento);
    }

    /**
     *
     * @return retorna a area do retângulo fazendo a fórmula para a area (comprimento * altura)
     */
    public int calcularArea(){
        return altura*comprimento;
    }

}
