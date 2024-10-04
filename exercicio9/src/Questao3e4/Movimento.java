package Questao3e4;
import java.time.LocalDate;
import java.time.LocalTime;


public class Movimento {

    private double valor;
    private TipoMovimento tipo;
    private LocalDate data;
    private LocalTime hora;

    public Movimento(double valor, TipoMovimento tipo) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public TipoMovimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimento tipo) {
        this.tipo = tipo;
    }
}
