public class calculadora {
    private double num1;
    private double num2;


    public double somar(){
        double resultadoSoma;
        resultadoSoma = num1+num2;
        return resultadoSoma;
    }

    public double subtrair(){
        double resultadoSubtração;
        resultadoSubtração = num1-num2;
        return resultadoSubtração;
    }

    public double dividir(){
        double resultadoDividir;
        resultadoDividir = num1/num2;
        return resultadoDividir;
    }

    public double multiplicar(){
        double resultadoMultiplicar;
        resultadoMultiplicar = num1*num2;
        return resultadoMultiplicar;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getNum2() {
        return num2;
    }
    
}
