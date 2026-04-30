//File: Persegi.java
//Deskripsi : Kelas Persegi sebagai kelas turunan dari BangunDatar
//Nama : Raffi Arditama
//Tanggal : 12 Maret 2026


public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Selector & Mutator
    public double getSisi() { return sisi; }
    public void setSisi(double sisi) { this.sisi = sisi; }

    // Implementasi abstract method BangunDatar
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
        System.out.println("Diagonal    : " + getDiagonal());
    }
}