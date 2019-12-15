public class NachylenieRK3 implements Nachylenie{

    public NachylenieRK3() {
    }

    private String nazwa = "RK3";
    private Pochodna pochodna;
    private double h;
    private int Waga = 3;

    @Override
    public double nachylenie(double x, double t) {
        double k1 = pochodna.policz(t,x);
        double k2 = pochodna.policz(t+h/2,x+h*k1/2);
        double k3 = pochodna.policz(t+h,x-h*k1+2*h*k2);
        return (k1+4*k2+k3)/6;
    }

    @Override
    public void setPochodna(Pochodna pochodna) {
        this.pochodna=pochodna;
    }

    @Override
    public void seth(double h) {
        this.h=h;
    }

    @Override
    public int getWaga() {
        return Waga;
    }

    @Override
    public String getNazwa() {
        return nazwa;
    }
}
