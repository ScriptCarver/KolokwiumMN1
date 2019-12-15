public class DrukujKroczki implements ZrobCosZKrokiem {
    @Override
    public void cos(int n, double t, double x, int koszt) {
        System.out.println("Krok: " +n+ ", t: "+t+", x: "+x+", koszt: "+koszt);
    }
}
