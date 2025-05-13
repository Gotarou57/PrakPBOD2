/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatargeneric;

/**
 *
 * @author ASUS
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public float hitungLuas() {
        return bangunDatar.luas();
    }
    
    public float hitungKeliling() {
        return bangunDatar.keliling();
    }


    public String getJenis() {
        return bangunDatar.getClass().getSimpleName();
    }
}

