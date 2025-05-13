/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author ASUS
 */
public class MainKoleksiAnabul {
    public static void main(String[] args) {
        // Membuat koleksi dengan kapasitas 10
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>(10);

        // Menambahkan 10 anabul (hewan peliharaan)
        koleksiAnabul.add(new Kucing("Kitty"));
        koleksiAnabul.add(new Anjing("Doggy"));
        koleksiAnabul.add(new Burung("Birdie"));
        koleksiAnabul.add(new Kucing("Luna"));
        koleksiAnabul.add(new Kucing("Milo"));
        koleksiAnabul.add(new Anjing("Rocky"));
        koleksiAnabul.add(new Anjing("Bella"));
        koleksiAnabul.add(new Burung("Rio"));
        koleksiAnabul.add(new Burung("Coco"));
        koleksiAnabul.add(new Burung("Chichi"));

        System.out.println("== Menampilkan semua anabul dengan showAll() ==");
        koleksiAnabul.showAll();

        System.out.println("\n== Menjalankan suara() dan gerak() ==");
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul a = koleksiAnabul.getIsi(i);
            a.suara();
            a.gerak();
            System.out.println();
        }

        System.out.println("== Mengubah isi index ke-1 menjadi Anjing baru (setIsi) ==");
        koleksiAnabul.setIsi(1, new Anjing("Bruno"));
        koleksiAnabul.getIsi(1).suara();

        System.out.println("\n== Menghapus elemen di index ke-0 (delete) ==");
        koleksiAnabul.delete(0);
        koleksiAnabul.showAll();

        System.out.println("\n== Ukuran koleksi saat ini (getSize): " + koleksiAnabul.getSize());
    }
}

