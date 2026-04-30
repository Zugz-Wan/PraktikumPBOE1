/* Nama File    : MGaris.java
   Deskripsi    : Berisi atribut dan method dalam class Garis
   Pembuat      : Raffi Arditama
   Tanggal      : 28 Februari 2026 
*/

public class MGaris {
    public static void main(String[] args) {

        // Test default titikAwal dan titikAkhir Garis
        Garis G1 = new Garis();
        G1.getTitikAwal();
        G1.getTitikAkhir();
        G1.printGaris();

        // Coba diganti
        G1.setTitikAwal(new Titik(1,1));
        G1.setTitikAkhir(new Titik(2,2));
        G1.printGaris();

        // Coba selektor counterGaris
        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());

        // Coba Gradien dan Titik Tengah
        System.out.println("Gradien G1 = " + G1.getGradien());

        Titik tengah = G1.getTitikTengah();
        System.out.println("Titik tengah G1:");
        tengah.printTitik();

        Titik A = new Titik(1,0);
        Titik B = new Titik(2,1);
        Garis G2 = new Garis(A,B);

        System.out.println("Apakah G1 sejajar G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("Persamaan garis G1:");
        G1.getPersamaanGaris();
    }
}