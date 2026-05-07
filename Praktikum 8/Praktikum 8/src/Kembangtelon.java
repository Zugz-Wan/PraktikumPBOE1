// NIM    : 24060124120020
// Nama   : Raffi Arditama
// Tanggal: 5 mei 2026
// Praktikum PBO Generik: Kembangtelon extends Kucing

public class Kembangtelon extends Kucing {

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Kembangtelon) bergerak dengan lincah dan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Kembangtelon) bersuara: Ngiau!");
    }

    @Override
    public String toString() {
        return nama + " (Kembangtelon, bobot=" + bobot + " kg)";
    }
}