/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koleksi;

/**
 *
 * @author ASUS
 */
public class Koleksi<T> {
    private int nElem = 0;       // jumlah elemen saat ini
    private T[] koleksi;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public Koleksi(int size) {
        maxSize = size;
        koleksi = (T[]) new Object[size];
    }

    // Prosedur untuk menambahkan elemen ke koleksi (di akhir)
    public void add(T data) {
        if (nElem < maxSize) {
            koleksi[nElem] = data;
            nElem++;
        } else {
            System.out.println("Koleksi penuh. Tidak dapat menambahkan elemen.");
        }
    }

    public void setIsi(int index, T data) {
        if (index >= 0 && index < maxSize) {
            koleksi[index] = data;
            if (index >= nElem) nElem = index + 1;
        }
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nElem) {
            return koleksi[index];
        }
        return null;
    }

    public void setSize(int size) {
        maxSize = size;
    }

    public int getSize() {
        return nElem;
    }

    public void delete(int index) {
        if (index >= 0 && index < nElem) {
            for (int i = index; i < nElem - 1; i++) {
                koleksi[i] = koleksi[i + 1];
            }
            koleksi[nElem - 1] = null;
            nElem--;
        }
    }

    public void showAll() {
        for (int i = 0; i < nElem; i++) {
            System.out.println(koleksi[i]);
        }
    }
}



