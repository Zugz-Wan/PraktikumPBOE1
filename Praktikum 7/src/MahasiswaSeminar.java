// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 4: MahasiswaSeminar extends CivitasAkademika

public class MahasiswaSeminar extends CivitasAkademika {

    private String nim;
    private Dosen  dosenWali;

    public MahasiswaSeminar(String nim, String nama) {
        super(nama);
        this.nim      = nim;
        this.dosenWali = null;
    }

    public String getNim() { return nim; }

    @Override
    public String getNomor() { return nim; }

    // (i) setWali
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    // (j) tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM              : " + nim);
        System.out.println("Nama Mahasiswa   : " + nama);
        if (dosenWali != null) {
            System.out.println("Nama Dosen Wali  : " + dosenWali.getNama());
        } else {
            System.out.println("Nama Dosen Wali  : (belum diset)");
        }
    }
}
