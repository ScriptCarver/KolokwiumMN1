public class RownanieZZad2 implements Pochodna {
    private double k;
    private double xmax;

    public RownanieZZad2(double k, double xmax) {
        this.k = k;
        this.xmax = xmax;
    }

    @Override
    public double policz(double t, double x) {
        return k*(1-x/xmax)*x;
    }
}
