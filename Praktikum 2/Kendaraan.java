/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Muhammad Iqbal Haqiqi / 24060123140191
 * Tanggal      : 1 Maret 2025
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter dan Setter
    public String getNoPlat() { 
        return noPlat; 
    }

    public void setNoPlat(String noPlat) { 
        this.noPlat = noPlat; 
    }
    
    public String getJenis() { 
        return jenis; 
    }

    public void setJenis(String jenis) { 
        this.jenis = jenis; 
    }
}
