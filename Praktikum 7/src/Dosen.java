// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 4: Dosen extends CivitasAkademika

public class Dosen extends CivitasAkademika {

    private String nip;

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() { return nip; }

    @Override
    public String getNomor() { return nip; }
}
