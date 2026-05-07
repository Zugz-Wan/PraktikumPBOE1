// NIM    : 24060124120020
// Nama   : Raffi Arditama
// Tanggal: 5 mei 2026
// Praktikum PBO Generik: Anggora extends Kucing

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Anggora) bergerak dengan anggun dan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Anggora) bersuara: Mrrrow~!");
    }

    @Override
    public String toString() {
        return nama + " (Anggora, bobot=" + bobot + " kg)";
    }
}