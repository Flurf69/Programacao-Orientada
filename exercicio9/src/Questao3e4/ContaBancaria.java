package Questao3e4;

import java.util.ArrayList;

public class ContaBancaria {

    private String numero;
    private double saldo;
    private Cliente titular;
    private ArrayList<Movimento> movimento;

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

    public ArrayList<Movimento> getContas() {
        return movimento;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.movimento = movimento;
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

    protected void incluirMovimento(Movimento m){
        movimento.add(m);
    }



}
