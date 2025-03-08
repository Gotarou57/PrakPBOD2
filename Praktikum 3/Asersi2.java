/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 * Nama/NIM  : Muhammad Iqbal Haqiqi/24060123140191
 * Tanggal   : 8 Maret 2025
 */

//class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
//karena tidak menggunakan if else, Asersi bisa dimatikan (tanpa -ea), jadi validasi jari-jari bisa terlewat. validasi harus selalu dijalankan di semua mode, baik run atau compile.
