/**
 * File      : AngkaSialException.java
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama/NIM  : Muhammad Iqbal Haqiqi/24060123140191
 * Tanggal   : 8 Maret 2025
 */

 public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
