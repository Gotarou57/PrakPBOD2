/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatargeneric;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends BangunDatar {
    private float radius;

    public Lingkaran(float radius) {
        this.radius = radius;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * radius * radius);
    }

    public float getRadius() {
        return radius;
    }
}

