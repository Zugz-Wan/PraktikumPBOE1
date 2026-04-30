// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 4: CivitasAkademika (Induk)

public abstract class CivitasAkademika {

    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    // Akan mengembalikan NIP (Dosen) atau NIM (Mahasiswa)
    public abstract String getNomor();
}
