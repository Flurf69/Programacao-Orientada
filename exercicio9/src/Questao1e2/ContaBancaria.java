package Questao1e2;

public class ContaBancaria {

    private String numero;
    private double saldo;
    private Cliente titular;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            throw new IllegalArgumentException("Valor insuficiente");
        }
        this.saldo -= valor;
    }

    public void transferir(ContaBancaria destino, double valor) {
        this.depositar(valor);
        destino.depositar(valor);
    }
}
