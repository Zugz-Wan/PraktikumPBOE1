//File: Lingkaran.java
//Deskripsi : Kelas Lingkaran sebagai kelas turunan dari BangunDatar
//Nama : Raffi Arditama
//Tanggal : 12 Maret 2026

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

    // Selector & Mutator
    public double getJari() { return jari; }
    public void setJari(double jari) { this.jari = jari; }

    // Implementasi abstract method BangunDatar
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari   : " + jari);
        System.out.printf ("Luas        : %.4f%n", getLuas());
        System.out.printf ("Keliling    : %.4f%n", getKeliling());
    }
}