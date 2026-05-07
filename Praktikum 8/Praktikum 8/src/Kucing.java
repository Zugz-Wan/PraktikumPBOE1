// NIM    : 24060124120020
// Nama   : Raffi Arditama
// Tanggal: 5 mei 2026
// Praktikum PBO Generik: Kucing extends Anabul

public class Kucing extends Anabul {

    protected double bobot; // atribut bobot dalam kilogram

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() { return bobot; }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meong!");
    }

    @Override
    public String toString() {
        return nama + " (Kucing, bobot=" + bobot + " kg)";
    }
}
