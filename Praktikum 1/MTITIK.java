/* Nama File    : MTITIK.java
 * Deskripsi    : Main class untuk menguji class Titik
 * Pembuat      : Muhammad Iqbal Haqiqi / 24060123140191
 * Tanggal      : 21 Februari 2025
 */

public class MTITIK {
    public static void main(String[] args) {
        Titik T1 = new Titik(3, 4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();


        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik(); 

        Titik T3 = new Titik(1, 5);
        T3.printTitik();       //PRINT T3
        Titik T4 = new Titik(3, -5);
        T4.printTitik();       //PRINT T4

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T3.getCounterTitik());
        
        int dran;
        dran = T4.getKuadran();
        System.out.println("Kuadran Titik T4 = " + dran);
        
        System.out.println("Jarak Pusat Titik T4 = " + T4.getJarakPusat());

        System.out.println("Jarak Titik T4 dan T3 = " + T4.getJarak(T3));

        T4.refleksiX();
        T4.printTitik();
        T4.refleksiY();
        T4.printTitik();
        System.out.println("Refleksi X T4 = " + T4.getRefleksiX());
        T4.printTitik();
        System.out.println("Refleksi Y T4 = " + T4.getRefleksiY());
        T4.printTitik();
    }

}


/**/