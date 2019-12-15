import java.util.ArrayList;

public class KlasaTestowa {
    public static void main(String[] args) {
        Hkuli hkuli = new Hkuli(1,200,1000);
        ArrayList<IterowaniePukntku0> MetodyZad1 = new ArrayList<>();
        Bisekcjonowanie bisekcjonowanie = new Bisekcjonowanie(0,2,0.0001, hkuli);
        Falsi falsi = new Falsi(0,2,0.0001, hkuli);
        Sieciowe sieciowe =  new Sieciowe(2,0.1,0.0001,hkuli);
        MetodyZad1.add(bisekcjonowanie);
        MetodyZad1.add(falsi);
        MetodyZad1.add(sieciowe);
        ArrayList<Double> wyniki = new ArrayList();
        for(IterowaniePukntku0 iter: MetodyZad1){
            double a = iter.iteruj();
            wyniki.add(a);
            System.out.println(a);
            System.out.println();
        }

        System.out.println("Zad2:");
        RownanieZZad2 rownanieZZad2 = new RownanieZZad2(0.026,12*Math.pow(10,9));
        double[] warunekpocz = {2.555*Math.pow(10,9),0};
        Iteracja RK3 = new Iteracja(rownanieZZad2,warunekpocz,new NachylenieRK3());
        double h=0.01;
        double t=10;
        for(int i=0;i<5;i++){
            RK3.iteruj(h,t);
            t+=10;
        }
    }
}
