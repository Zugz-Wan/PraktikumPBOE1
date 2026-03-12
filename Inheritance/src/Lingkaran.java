//File: Lingkaran.java
//Deskripsi : Kelas Lingkaran sebagai kelas turunan dari BangunDatar
//Nama : Raffi Arditama
//Tanggal : 12 Maret 2024

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super(0, "Tidak diketahui", "Tidak diketahui");
        this.jari = 0;
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }
    
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }



}
