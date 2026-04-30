//File: Main.java
//Deskripsi : Main class 
//Nama : Raffi Arditama
//Tanggal : 29 April 2026

public class Main {
    public static void main(String[] args) {

        // PEMBUATAN OBJEK 
        // BangunDatar B1 = new BangunDatar();  ERROR abstract class tidak bisa diinstansiasi
        BangunDatar P1 = new Persegi(10, "Merah", "Tebal");  
        Persegi     P2 = new Persegi(5, "Hijau", "Tipis");   
        BangunDatar L1 = new Lingkaran(7, "Biru", "Tebal");  
        // Lingkaran L1 = new Lingkaran(14, ...); 
        Lingkaran   L2 = new Lingkaran(14, "Kuning", "Tipis"); 

        System.out.println("===== INFO PERSEGI P1 =====");
        P1.printInfo();

        System.out.println("\n===== INFO PERSEGI P2 =====");
        P2.printInfo();

        System.out.println("\n===== INFO LINGKARAN L1 =====");
        L1.printInfo();

        System.out.println("\n===== INFO LINGKARAN L2 =====");
        L2.printInfo();

        // PERBANDINGAN LUAS & KELILING 
        System.out.println("\n===== PERBANDINGAN =====");
        System.out.println("Luas P1 == Luas P2?        : " + P1.isEqualLuas(P2));
        System.out.println("Luas P1 == Luas L1?        : " + P1.isEqualLuas(L1));  // beda jenis!
        System.out.println("Keliling P1 == Keliling L1?: " + P1.isEqualKeliling(L1));
        System.out.println("Keliling P2 == Keliling L1?: " + P2.isEqualKeliling(L1));

        System.out.println("\nCounter BangunDatar: " + BangunDatar.getCounterBangunDatar());


    }
}