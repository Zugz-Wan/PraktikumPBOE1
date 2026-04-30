// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 3: Simulasi Anabul

public class Soal3 {
    public static void main(String[] args) {

        // Array bertipe induk Anabul → polimorfisme inclusion
        Anabul[] anabulList = {
            new Kucing("Mimi"),
            new Anjing("Rex"),
            new Burung("Tweety")
        };

        System.out.println("=== Simulasi Bunyi dan Gerakan Anabul ===\n");
        for (Anabul a : anabulList) {
            a.Bersuara();
            a.Gerak();
            System.out.println();
        }
    }
}
