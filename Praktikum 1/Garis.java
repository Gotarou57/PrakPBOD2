/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Muhammad Iqbal Haqiqi / 24060123140191
 * Tanggal      : 21 Februari 2025
 */


public class Garis {
    //ATRIBUT
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;
    double panjangGaris;
    
    //METHOD
    //konstruktor membuat garis dengan titik awal dan titik akhir (0,0) dan (1,1)
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter titikAwal dan titikAkhir
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor (getter) dan mutator (setter)
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Method untuk mendapatkan panjang garis
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // Method untuk mendapatkan gradien garis
    public double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return deltaY / deltaX;
    }

    // Method untuk mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // Method untuk mengecek apakah garis sejajar dengan garis lain
    public boolean isSejajar(Garis garisLain) {
        return this.getGradien() == garisLain.getGradien();
    }

    // Method untuk mengecek apakah garis tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis garisLain) {
        return this.getGradien() * garisLain.getGradien() == -1;
    }

    // Method untuk menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Titik Awal: " + titikAwal.toString());
        System.out.println("Titik Akhir: " + titikAkhir.toString());
    }

    // Method untuk menampilkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
