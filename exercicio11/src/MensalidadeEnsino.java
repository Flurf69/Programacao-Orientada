public class MensalidadeEnsino implements Pagavel {

    private int nrCreditos;
    private double precoCredito;

    public MensalidadeEnsino(int nrCreditos, double precoCredito) {
        this.nrCreditos = nrCreditos;
        this.precoCredito = precoCredito;
    }

    @Override
    public double calculaValor() {
        return nrCreditos * precoCredito;
    }

    public int getNrCreditos() {
        return nrCreditos;
    }

    public void setNrCreditos(int nrCreditos) {
        this.nrCreditos = nrCreditos;
    }

    public double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(double precoCredito) {
        this.precoCredito = precoCredito;
    }
}
