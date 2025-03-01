/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Muhammad Iqbal Haqiqi / 24060123140191
 * Tanggal      : 1 Maret 2025
 */


 public class Titik2 {
    //ATRIBUT
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
    int kuadran;

    //METHOD
    //konstruktor membuat titik (0,0)
    Titik2(){
        absis = 0;
        ordinat = 0;
        kuadran = 0;
        counterTitik++;
    }

    //konstruktor membuat titik (x,y)
    public Titik2(double x, double y){
        absis = x;
        ordinat = y;
        kuadran = 0;
        counterTitik++;
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + y;
        ordinat = ordinat + x;
    }

    // mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai kudran titik
    public int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            kuadran = 1;
        }
        else if (absis < 0 && ordinat > 0) {
            kuadran = 2;
        }
        else if (absis < 0 && ordinat < 0) {
            kuadran = 3;
        }
        else if (absis > 0 && ordinat < 0) {
            kuadran = 4;
        }
        return kuadran;
    }

    // mengembalikan jarak pusat
    public double getJarakPusat(){
        return Math.sqrt(
            (getAbsis() * getAbsis()) 
            + 
            (getOrdinat() * getOrdinat())
        );
    }

    // mengembalikan jarak 2 titik
    public double getJarak(Titik2 T1){
        return Math.sqrt(
            Math.pow((absis - T1.getAbsis()), 2)  
            + 
            Math.pow((ordinat - T1.getOrdinat()), 2)
        );
    }

    // merefleksi x
    public void refleksiX(){
        absis = absis * -1;
    }

    // merefleksi y
    public void refleksiY(){
        ordinat = ordinat * -1;
    }

    // mengembalikan nilai titik setelah refleksi x
    public Titik2 getRefleksiX(){
        Titik2 a = new Titik2();
        a.setOrdinat(this.ordinat * -1);
        a.setAbsis(this.absis);

        return a;
    }

    // mengembalikan nilai titik setelah refleksi y
    public Titik2 getRefleksiY(){
        Titik2 a = new Titik2();
        a.setOrdinat(this.ordinat);
        a.setAbsis(this.absis * -1);

        return a;
    }

    // Override toString() untuk mencetak objek dengan format yang jelas
    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }
}
