// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 4: Program Utama Seminar

public class Soal4 {
    public static void main(String[] args) {

        // ── (e) Buat 2 dosen dan 5 mahasiswa ─────────────────────────────
        Dosen d1 = new Dosen("196801011990031001", "Dr. Andi Prasetyo");
        Dosen d2 = new Dosen("197205151998022002", "Dr. Siti Rahayu");

        MahasiswaSeminar ms1 = new MahasiswaSeminar("24060123001", "Budi Santoso");
        MahasiswaSeminar ms2 = new MahasiswaSeminar("24060123002", "Citra Dewi");
        MahasiswaSeminar ms3 = new MahasiswaSeminar("24060123003", "Eko Prasetyo");
        MahasiswaSeminar ms4 = new MahasiswaSeminar("24060123004", "Fani Wijaya");
        MahasiswaSeminar ms5 = new MahasiswaSeminar("24060123005", "Gilang Ramadhan");

        // ── (f) Registrasi semua peserta ─────────────────────────────────
        System.out.println("=== Registrasi Peserta ===");
        Seminar seminar = new Seminar();
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(ms1);
        seminar.registrasi(ms2);
        seminar.registrasi(ms3);
        seminar.registrasi(ms4);
        seminar.registrasi(ms5);

        // ── (c) countPeserta ─────────────────────────────────────────────
        System.out.println("\nTotal peserta: " + seminar.countPeserta());

        // ── (g) tampilPeserta ────────────────────────────────────────────
        seminar.tampilPeserta();

        // ── (h) countMahasiswa ────────────────────────────────────────────
        System.out.println("\nJumlah peserta mahasiswa: " + seminar.countMahasiswa());

        // ── (i) setWali ───────────────────────────────────────────────────
        System.out.println("\n=== Set Dosen Wali ===");
        ms1.setWali(d1);
        ms2.setWali(d1);
        ms3.setWali(d2);
        ms4.setWali(d2);
        ms5.setWali(d1);
        System.out.println("Dosen wali berhasil diset.");

        // ── (j) tampilDataMahasiswa ───────────────────────────────────────
        System.out.println("\n=== Data Mahasiswa ===");
        MahasiswaSeminar[] semuaMhs = {ms1, ms2, ms3, ms4, ms5};
        for (MahasiswaSeminar ms : semuaMhs) {
            ms.tampilDataMahasiswa();
            System.out.println("---");
        }
    }
}
