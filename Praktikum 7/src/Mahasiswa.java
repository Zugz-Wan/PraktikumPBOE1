// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 2: Kelas Mahasiswa (Overloading)

public class Mahasiswa {

    // ── Atribut ───────────────────────────────────────────────────────────
    private String nim;
    private String nama;
    private String programStudi;

    // ── Konstruktor (c) tanpa parameter → default ─────────────────────────
    public Mahasiswa() {
        this.nim          = "-999";
        this.nama         = "n/a";
        this.programStudi = "n/a";
    }

    // ── Konstruktor (d) tiga parameter ────────────────────────────────────
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim          = nim;
        this.nama         = nama;
        this.programStudi = programStudi;
    }

    // ── Konstruktor (e) kloning dari objek Mahasiswa lain ─────────────────
    public Mahasiswa(Mahasiswa lain) {
        this.nim          = lain.nim;
        this.nama         = lain.nama;
        this.programStudi = lain.programStudi;
    }

    // ── Getter & Setter dasar ─────────────────────────────────────────────
    public String getNim()          { return nim; }
    public String getNama()         { return nama; }
    public String getProgramStudi() { return programStudi; }

    public void setNim(String nim)   { this.nim  = nim; }
    public void setNama(String nama) { this.nama = nama; }

    // ── setProgramStudi overloading (a & b) ───────────────────────────────
    // Varian 1: tanpa parameter → "Kosong"
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    // Varian 2: satu parameter String
    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    // Varian 3: satu parameter objek Mahasiswa lain (ambil prodinya)
    public void setProgramStudi(Mahasiswa lain) {
        this.programStudi = lain.programStudi;
    }

    // ── Tampilkan data ────────────────────────────────────────────────────
    public void tampilData() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Program Studi: " + programStudi);
    }
}
