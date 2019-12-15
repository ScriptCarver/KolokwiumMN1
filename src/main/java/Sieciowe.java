public class Sieciowe implements IterowaniePukntku0 {

    private double xl;
    private double xl2;
    private double dokl;
    private Funkcja f;
    private double xrnew;

    public Sieciowe(double xl, double xl2, double dokl, Funkcja f) {
        this.xl = xl;
        this.xl2 = xl2;
        this.dokl = dokl;
        this.f = f;
    }

    public double iteruj(){
        System.out.println(toString());
        System.out.println(f);
        double xrold=0;
        double obdokla=1;
        int licznik=1;
        while(obdokla>dokl) {
            xrnew =xl - ((f.policz(xl)*(xl2-xl))/(f.policz(xl2)-f.policz(xl)));
            obdokla = Math.abs((xrnew - xrold) / xrnew);
            xrold=xrnew;
            xl2 = xl;
            xl = xrnew;
            licznik++;
        }
        return xrold;
    }
}
