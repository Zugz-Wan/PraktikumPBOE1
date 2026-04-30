// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 3: Kucing extends Anabul

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meong!");
    }
}
