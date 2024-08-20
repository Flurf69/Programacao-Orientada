public class App {

    calculadora c;
    public static void main(String[] args) throws Exception {
        calculadora c = new calculadora();
        c.setNum1(30);
        c.setNum2(5);

        System.out.println("a soma é " + c.somar());
        System.out.println("a subtração é " + c.subtrair());
        System.out.println("a divisão é " + c.dividir());
        System.out.println("a multiplicação é " + c.multiplicar());
        System.out.println("o primeiro numero é " + c.getNum1() + " e o segundo numero é " + c.getNum2());
    }
}
