/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Muhammad Iqbal Haqiqi / 24060123140191
 * Tanggal      : 1 Maret 2025
 */

// Class Dosen
public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter dan Setter
    public String getNip() { 
        return nip; 
    }

    public void setNip(String nip) { 
        this.nip = nip; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getProdi() { 
        return prodi; 
    }
    
    public void setProdi(String prodi) { 
        this.prodi = prodi; 
    }
}
