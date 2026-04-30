//File: MBangunDatar.java
//Deskripsi : Kelas MBangunDatar sebagai kelas induk untuk menjalankan program bangun datar
//Nama : Raffi Arditama
//Tanggal : 12 Maret 2024

public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi1 = new Persegi(5, "Merah", "Tebal");
        System.out.println("Informasi Persegi:");
        persegi1.printInfo();
        System.out.println("Luas Persegi: " + persegi1.getLuas());
        System.out.println("Keliling Persegi: " + persegi1.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi1.getDiagonal());

        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(7, "Biru", "Tipis");
        System.out.println("Informasi Lingkaran:");
        lingkaran1.printInfo();
        System.out.println("Luas Lingkaran: " + lingkaran1.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran1.getKeliling());
    }
}
