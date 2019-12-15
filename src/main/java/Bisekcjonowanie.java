public class Bisekcjonowanie implements IterowaniePukntku0 {
    private double xl;
    private double xu;
    private double dokl;
    private Funkcja f;
    private double xrnew;

    public Bisekcjonowanie(double xl, double xu, double dokl, Funkcja f) {
        this.xl = xl;
        this.xu = xu;
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
            xrnew = (xl + xu) / 2;
            obdokla = Math.abs((xrnew - xrold) / xrnew);
            if ((f.policz(xl) * f.policz(xrnew)) == 0) {
                obdokla = 0;
            } else if ((f.policz(xl) * f.policz(xrnew)) < 0) {
                xu = xrnew;
            } else if ((f.policz(xl) * f.policz(xrnew)) > 0) {
                xl = xrnew;
            }
            xrold=xrnew;
            licznik++;
        }
        return xrold;
    }
}
