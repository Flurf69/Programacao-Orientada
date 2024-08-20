package numero2;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;


    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        if (numero == null||numero.isBlank()) {
            throw new IllegalArgumentException("numero da conta é invalido");
        }
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;

    }
    public void setTitular(String titular) {
        if(titular == null||titular.isBlank()) {
            throw new IllegalArgumentException("o titular é invalido");
        }

        this.titular = titular;

    }

    public void depositar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Não é possível depositar esse valor");
        }
        valor += this.saldo;
    }

    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Não é possível sacar esse valor");
        }
        if(valor > saldo){
            throw new IllegalArgumentException("saldo insuficiente");
        }
        this.saldo -= valor;
    }

    /**
     * transfere valor do objeto atual para destino
     * @param contaDestino conta destino da transferencia
     * @param valor valor da operação
     */
    public void transferir(ContaBancaria contaDestino, double valor){
        if(contaDestino == null){
            throw new IllegalArgumentException("conta destino é invalida");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}
