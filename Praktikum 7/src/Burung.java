// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 3: Burung extends Anabul

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Burung) bersuara: Cuit!");
    }
}
