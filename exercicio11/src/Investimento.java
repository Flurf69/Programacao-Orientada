public class Investimento implements Pagavel {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calculaValor() {
        return 0;
    }
}
