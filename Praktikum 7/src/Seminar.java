// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 4: Seminar

public class Seminar {

    // (b) Array statis max 100, bukan ArrayList
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    // Konstruktor: inisialisasi banyakPeserta = 0
    public Seminar() {
        pesertas     = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // (c) countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // (d) registrasi: tambah peserta secara kontigu
    public void registrasi(CivitasAkademika peserta) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = peserta;
            banyakPeserta++;
            System.out.println("Berhasil mendaftarkan: " + peserta.getNama());
        } else {
            System.out.println("Seminar penuh! Tidak bisa mendaftarkan: " + peserta.getNama());
        }
    }

    // (g) tampilPeserta
    public void tampilPeserta() {
        System.out.println("\n=== Daftar Peserta Seminar ===");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + ". [" + pesertas[i].getNomor() + "] "
                               + pesertas[i].getNama());
        }
    }

    // (h) countMahasiswa dengan instanceof
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                count++;
            }
        }
        return count;
    }
}
