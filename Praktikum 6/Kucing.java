public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " berbunyi: Meong!");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }
}