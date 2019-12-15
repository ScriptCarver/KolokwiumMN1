public class Hkuli implements Funkcja{
    private double r;
    private double gestosckuli;
    private double gestoscosrodka;

    public Hkuli(double r, double gestosckuli, double gestoscosrodka) {
        this.r = r;
        this.gestosckuli = gestosckuli;
        this.gestoscosrodka = gestoscosrodka;
    }

    public double policz(double h){
        return 4/3*Math.PI*Math.pow(r,3)*gestosckuli-((4/3*Math.PI*Math.pow(r,3)-(Math.PI*Math.pow(h,2)*(3*r-h)/3))*gestoscosrodka);
    }
}
