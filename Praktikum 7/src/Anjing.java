// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 3: Anjing extends Anabul

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Anjing) bersuara: Guk-guk!");
    }
}
