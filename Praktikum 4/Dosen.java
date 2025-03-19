/*
 * Nama File    : Dosen.java
 * Deskripsi    : Program untuk class Dosen
 * Pembuat      : Muhammad Iqbal Haqiqi / 24060123140191
 * Tanggal      : 18 Maret 2025
 */
class Dosen extends Pegawai {
    protected String Fakultas;

    public Dosen(String NIP, String nama, String tglLahir, String TMT, double gajiPokok, String Fakultas) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo() {}
}
