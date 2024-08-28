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

    /**
     *
     * @param altura altura do retangulo
     * @throws IllegalArgumentException caso altura seja 0 ou menor lança exceção
     */
    @SuppressWarnings("unused")
    public void setAltura(int altura) throws IllegalArgumentException {
        if(altura <= 0){
            throw new IllegalArgumentException("Altura " + altura + "é invalida");
        }
        this.altura = altura;
    }

    @SuppressWarnings("unused")
    public int getAltura() {
        return altura;
    }

    /**
     *
     * @param comprimento comprimento do retangulo
     * @throws IllegalArgumentException caso comprimento seja 0 ou menor lança exceção
     */
    @SuppressWarnings("unused")
    public void setComprimento(int comprimento) throws IllegalArgumentException {
        if(comprimento <= 0){
            throw new IllegalArgumentException("Comprimento " + comprimento + " invalido");
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
