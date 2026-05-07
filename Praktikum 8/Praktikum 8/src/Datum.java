// NIM    : 24060124120020
// Nama   : Raffi Arditama
// Tanggal: 5 mei 2026
// Praktikum PBO Generik: Kelas Generik Datum

public class Datum<T> {

    private T isi;

    // Constructor
    public Datum(T isi) {
        this.isi = isi;
    }

    // Fungsi getIsi: mengembalikan nilai isi Datum
    public T getIsi() {
        return isi;
    }

    // Prosedur setIsi: mengubah isi Datum menjadi isibaru
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    @Override
    public String toString() {
        return "Datum{isi=" + isi + "}";
    }
}