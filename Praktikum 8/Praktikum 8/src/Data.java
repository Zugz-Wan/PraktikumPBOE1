// NIM    : 24060124120020
// Nama   : Raffi Arditama
// Tanggal: 5 mei 2026
// Praktikum PBO Generik: Kelas Generik Data (Larik Generik)

public class Data<T> {

    // Larik statik 100 elemen generik
    // Java tidak mengizinkan new T[100] langsung → gunakan Object[] lalu cast
    private Object[] ruang;
    private int banyak; // banyaknya elemen efektif

    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    // -------------------------------------------------------
    // Soal 3b: Prosedur setIsi
    // Parameter 1: posisi {1..100}
    // Parameter 2: objek yang akan mengisi posisi tersebut
    // -------------------------------------------------------
    public void setIsi(int posisi, T objek) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi " + posisi + " tidak valid! Harus antara 1-100.");
            return;
        }
        // Jika posisi ini belum pernah diisi, tambah banyak
        if (ruang[posisi - 1] == null) {
            banyak++;
        }
        ruang[posisi - 1] = objek;
    }

    // -------------------------------------------------------
    // Soal 3c: Fungsi getIsi
    // Parameter: posisi {1..100}
    // Mengembalikan elemen pada posisi tersebut
    // -------------------------------------------------------
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi " + posisi + " tidak valid! Harus antara 1-100.");
            return null;
        }
        return (T) ruang[posisi - 1];
    }

    // -------------------------------------------------------
    // Soal 3d: Fungsi getSize
    // Mengembalikan banyak elemen efektif
    // -------------------------------------------------------
    public int getSize() {
        return banyak;
    }
}