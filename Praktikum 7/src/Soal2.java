// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 2: Aplikasi Overloading Mahasiswa

public class Soal2 {
    public static void main(String[] args) {

        // ── (c) Konstruktor tanpa parameter ───────────────────────────────
        System.out.println("=== (c) Konstruktor Default ===");
        Mahasiswa m1 = new Mahasiswa();
        m1.tampilData();

        // ── (d) Konstruktor tiga parameter ────────────────────────────────
        System.out.println("\n=== (d) Konstruktor Tiga Parameter ===");
        Mahasiswa m2 = new Mahasiswa("24060123001", "Budi Santoso", "Informatika");
        m2.tampilData();

        // ── (e) Konstruktor kloning ────────────────────────────────────────
        System.out.println("\n=== (e) Konstruktor Kloning ===");
        Mahasiswa m3 = new Mahasiswa(m2); // clone dari m2
        m3.tampilData();

        // ── (b) Aplikasi semua varian setProgramStudi ─────────────────────
        System.out.println("\n=== (b) Varian setProgramStudi ===");

        // Varian 1: tanpa parameter
        Mahasiswa mA = new Mahasiswa("24060123002", "Ani Lestari", "Statistika");
        mA.setProgramStudi();
        System.out.println("[Varian 1 - tanpa param]");
        mA.tampilData();

        // Varian 2: dengan String
        Mahasiswa mB = new Mahasiswa("24060123003", "Candra Wijaya", "Matematika");
        mB.setProgramStudi("Teknik Informatika");
        System.out.println("\n[Varian 2 - dengan String]");
        mB.tampilData();

        // Varian 3: dengan objek Mahasiswa lain
        Mahasiswa mC = new Mahasiswa("24060123004", "Dewi Rahayu", "Fisika");
        mC.setProgramStudi(m2); // ambil prodi dari m2
        System.out.println("\n[Varian 3 - dari objek lain]");
        mC.tampilData();
    }
}
