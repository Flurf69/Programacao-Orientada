package numero1;

public class Ponto {

    private int x;
    private int y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public Quadrante identificarQuadrante() {
        Quadrante quadrante = null;

        if (x > 0 && y > 0) {
            quadrante = Quadrante.PRIMEIRO;
        } else if (x < 0 && y > 0) {
            quadrante = Quadrante.SEGUNDO;
        } else if (x < 0 && y < 0) {
            quadrante = Quadrante.TERCEIRO;
        } else if (x > 0 && y < 0) {
            quadrante = Quadrante.QUARTO;
        }
        return quadrante  = Quadrante.NENHUM;

    }
    public boolean estaIncidindoSobreX(){
        if (getY() == 0 && getX() > 0 ){
            return true;
        }
        return false;
    }
    public boolean estaIncidindoSobreY(){
        if (getY() > 0 && getX() == 0 ){
            return true;
        }
        return false;
    }

    public double calcularDistancia(Ponto outroPonto){
        return 0.0;
    }
}
