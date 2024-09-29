package Questao1e2;

public class ContaEspecial extends ContaBancaria {

    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor > limiteCredito+getSaldo()) {
            throw new IllegalArgumentException("Valor insuficiente");
        }
        setSaldo(getSaldo()-valor);
    }
}
