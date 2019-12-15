public class Iteracja {
    private Pochodna pochodna;
    private int koszt;
    private double[] warunekPoczatkowy;
    private Nachylenie nachylenie;
    private ZrobCosZKrokiem zrobCosZKrokiem;
    private String nazwa;

    public Iteracja(Pochodna pochodna, double[] warunekPoczatkowy, Nachylenie nachylenie) {
        this.pochodna = pochodna;
        this.warunekPoczatkowy = warunekPoczatkowy;
        this.nachylenie = nachylenie;
        nachylenie.setPochodna(pochodna);
        nazwa = nachylenie.getNazwa();
    }

    public void setZrobCosZKrokiem(ZrobCosZKrokiem zrobCosZKrokiem) {
        this.zrobCosZKrokiem = zrobCosZKrokiem;
    }

    public void iteruj(double h, double docelowet){
        System.out.println(nazwa+":");
        nachylenie.seth(h);
        double wynikx = krok(warunekPoczatkowy[0],warunekPoczatkowy[1],h);
        int n = 1;
        int waga = nachylenie.getWaga();
        int koszt = waga;
        double obecnat = warunekPoczatkowy[1] + h;

        if(zrobCosZKrokiem!=null){
            zrobCosZKrokiem.cos(n,obecnat,wynikx,koszt);
        }

        while(obecnat < docelowet){
            wynikx = krok(wynikx,obecnat,h);
            obecnat += h;
            n++;
            koszt+=waga;
            if(zrobCosZKrokiem!=null){
                zrobCosZKrokiem.cos(n,obecnat,wynikx,koszt);
            }
        }

        System.out.println("Koszt: "+koszt + ", Wynik: "+wynikx+", t: "+docelowet);
    }

    private double dokl(double wynikx, double warpraw){
        return Math.abs((warpraw-wynikx)/warpraw*100);
    }

    private double krok(double x, double t, double h){
        return x+(nachylenie.nachylenie(x,t)*h);
    }
}
