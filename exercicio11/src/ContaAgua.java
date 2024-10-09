public class ContaAgua implements Pagavel {

    private int metrosCubicos;
    private double precoMetroCubo;

    public ContaAgua(int metrosCubicos, double precoMetroCubo) {
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubo = precoMetroCubo;
    }

    @Override
    public double calculaValor() {
        return metrosCubicos * precoMetroCubo;
    }

    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(int metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public double getPrecoMetroCubo() {
        return precoMetroCubo;
    }

    public void setPrecoMetroCubo(double precoMetroCubo) {
        this.precoMetroCubo = precoMetroCubo;
    }
}
