/* Nama File    : Titik.java
   Deskripsi    : Berisi atribut dan method dalam class Titik
   Pembuat      : Raffi Arditama
   Tanggal      : 28 Februari 2026 
*/
public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /***************METHOD***************/
    // Konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
        counterTitik++;
    }

    // Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu 
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    // Mengganti nilai absis dengan nilai x
    public void setAbsis(double x){
        absis = x;
    }

    // Mengganti nilai ordinat dengan nilai x
    public void setOrdinat(double y){
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat sebesar x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // Mencetak counterTitik
    public static void printCounterTitik(){
        System.out.println(getCounterTitik());
    }   

    // Menentukan kuadran dari sebuah titik
    public int getKuadran(){
        if(absis > 0 && ordinat > 0) return 1;
        if(absis < 0 && ordinat > 0) return 2;
        if(absis < 0 && ordinat < 0) return 3;
        if(absis > 0 && ordinat < 0) return 4;
        return 0; // jika di sumbu
    }

    // Menghitung jarak titik ke pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    // Menghitung jarak titik ke titik yang lain
    public double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // Merefleksi titik terhadap sumbu X
    public void refleksiX(){
        ordinat = -ordinat;
    }

    // Merefleksi titik terhadap sumbu Y
    public void refleksiY(){
        absis = -absis;
    }

    // Membuat titik baru berdasarkan refleksi dari sumbu X
    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    // Membuat titik baru berdasarkan refleksi dari sumbu Y
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
    }
} 
