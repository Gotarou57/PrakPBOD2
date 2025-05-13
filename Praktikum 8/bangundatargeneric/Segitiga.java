/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatargeneric;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisiMiring;

    public Segitiga(float alas, float tinggi, float sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public float keliling() {
        return alas + tinggi + sisiMiring;
    }
}

