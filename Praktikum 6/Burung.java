public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " berbunyi: Cuit!");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }
}