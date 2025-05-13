/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author ASUS
 */
public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<String> koleksiNama = new Koleksi<>(10);
        koleksiNama.setIsi(0, "Panji");
        koleksiNama.setIsi(1, "Wisnu");
        koleksiNama.setIsi(2, "Wibowo");
        koleksiNama.setIsi(3, "Ronaldo");
        koleksiNama.setIsi(4, "Asep");
        koleksiNama.setIsi(5, "Dontol");
        koleksiNama.setIsi(6, "Dino");
        koleksiNama.setIsi(7, "Adelene");
        
       
        System.out.println("== Menambahkan data dengan add() ==");
        koleksiNama.add("Messi");
        koleksiNama.add("Mbappe");
        koleksiNama.add("Neymar");
        koleksiNama.showAll();

        System.out.println("\n== Mengubah data dengan setIsi() (index 1 diubah ke 'Budi') ==");
        koleksiNama.setIsi(1, "Budi");
        koleksiNama.showAll();

        System.out.println("\n== Mengambil data dengan getIsi() ==");
        System.out.println("Data di index 0: " + koleksiNama.getIsi(0));
        System.out.println("Data di index 2: " + koleksiNama.getIsi(2));

        System.out.println("\n== Menghapus data dengan delete() (hapus index 1) ==");
        koleksiNama.delete(1);
        koleksiNama.showAll();

        System.out.println("\n== Menampilkan jumlah elemen aktif dengan getSize() ==");
        System.out.println("Jumlah elemen aktif: " + koleksiNama.getSize());

        System.out.println("\n== Mengubah kapasitas koleksi dengan setSize(3) ==");
        koleksiNama.setSize(3); // Hanya kapasitas, tidak langsung terlihat efeknya
        // Tambahkan elemen baru setelah kapasitas diubah
        koleksiNama.add("Rani");
        koleksiNama.showAll();
    }
}



