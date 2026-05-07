// NIM    : 24060124120020
// Nama   : Raffi Arditama
// Tanggal: 5 mei 2026
// Praktikum PBO - Soal 3: Kelas Anabul (Induk)

public abstract class Anabul {

    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    // Metode abstrak → wajib di-override setiap subclass
    public abstract void Gerak();
    public abstract void Bersuara();
}
