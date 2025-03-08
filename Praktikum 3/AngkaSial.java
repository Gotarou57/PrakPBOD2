/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Nama/NIM  : Muhammad Iqbal Haqiqi/24060123140191
 * Tanggal   : 8 Maret 2025
 */

 public class AngkaSial {

    // Method dengan klausa throws karena berpotensi lempar AngkaSialException
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            // Melempar exception secara manual dengan klausa throw
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13);  // ini akan melempar AngkaSialException
            as.cobaAngka(12);  // baris ini tidak akan dieksekusi
        } catch (AngkaSialException ase) {
            // Menangkap eksepsi dan menampilkan pesan error
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}


// baris 12 (System.out.println(angka + " bukan angka sial");) tidak akan dieksekusi karena Pada baris 11, terdapat pernyataan throw new AngkaSialException(); yang melempar eksepsi jika nilai angka adalah 13.Setelah eksepsi dilempar, eksekusi metode cobaAngka() langsung dihentikan dan tidak akan melanjutkan ke baris 12.Program akan langsung melompat ke blok catch yang menangani eksepsi tersebut.

//baris 21 (as.cobaAngka(12);) tidak akan dieksekusi karena pemanggilan as.cobaAngka(13); pada baris 19 menyebabkan eksepsi AngkaSialException dilempar.Setelah eksepsi dilempar, program langsung melompat ke blok catch, sehingga eksekusi as.cobaAngka(12); pada baris 21 tidak akan dijalankan.