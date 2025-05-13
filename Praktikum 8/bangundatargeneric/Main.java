/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatargeneric;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        BangunDatarGeneric<Persegi> persegi = new BangunDatarGeneric<>();
        persegi.set(new Persegi(5));

        BangunDatarGeneric<PersegiPanjang> pp = new BangunDatarGeneric<>();
        pp.set(new PersegiPanjang(4, 6));

        BangunDatarGeneric<Segitiga> segitiga = new BangunDatarGeneric<>();
        segitiga.set(new Segitiga(3, 4, 5));

        System.out.println(persegi.getJenis() + ": Luas = " + persegi.hitungLuas() + ", Keliling = " + persegi.hitungKeliling());
        System.out.println(pp.getJenis() + ": Luas = " + pp.hitungLuas() + ", Keliling = " + pp.hitungKeliling());
        System.out.println(segitiga.getJenis() + ": Luas = " + segitiga.hitungLuas() + ", Keliling = " + segitiga.hitungKeliling());
    }
}



//Program BangunDatarGeneric menunjukkan bahwa penggunaan generic dalam Java memungkinkan pembuatan kelas yang fleksibel dan dapat digunakan untuk berbagai jenis objek, selama objek tersebut merupakan turunan dari kelas tertentu, dalam hal ini `BangunDatar`. Dengan membatasi tipe generic menggunakan `T extends BangunDatar`, kita memastikan bahwa hanya objek yang memiliki metode `luas()` yang dapat digunakan, sehingga kode menjadi lebih aman dan konsisten. Selain itu, penggunaan generic juga mendukung prinsip pewarisan dan polimorfisme dalam pemrograman berorientasi objek. Penamaan parameter generic seperti `T`, `T1`, atau nama lainnya bersifat bebas, selama digunakan secara konsisten di seluruh kelas. Program ini memperlihatkan bagaimana konsep generic dan inheritance dapat digunakan secara bersamaan untuk menciptakan kode yang lebih modular, efisien, dan dapat digunakan kembali.


