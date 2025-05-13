/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author ASUS
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " berbunyi: Cuit!");
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }
}
