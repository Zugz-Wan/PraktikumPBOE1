/* Nama File    : Garis.java
   Deskripsi    : Berisi atribut dan method dalam class Garis
   Pembuat      : Raffi Arditama
   Tanggal      : 28 Februari 2026 
*/

public class Garis {
    /***************ATRIBUT***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /***************METHOD***************/
    public Garis(){
        this.titikAwal = new Titik();
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    public double hitungPanjangGaris(){
        return titikAwal.getJarak(titikAkhir);
    }

    public double getGradien() {
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();

    if (x2 - x1 == 0) {
        return Double.POSITIVE_INFINITY; 
    }
        return (y2 - y1) / (x2 - x1);
    }

    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }
    public boolean isSejajar(Garis G) {
        return Math.abs(this.getGradien() - G.getGradien()) < 0.0001;
    }

    public boolean isTegakLurus(Garis G) {
        return Math.abs(this.getGradien() * G.getGradien() + 1) < 0.0001;
    }

    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    public String getPersamaanGaris() {
        if (titikAwal.getAbsis() == titikAkhir.getAbsis()) {
            return "x = " + titikAwal.getAbsis();
        }

        double m = getGradien();
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double c = y1 - (m * x1);

        return "y = " + m + "x + " + c;
    }

} 