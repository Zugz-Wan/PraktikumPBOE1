// NIM    : 24060124120020
// Nama   : Raffi Arditama
// Tanggal: 5 mei 2026
// Praktikum PBO Generik: Kelas OperatorGenerik


public class OperatorGenerik {

    public static <T> void Tukar(T[] a, T[] b) {
        T temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    public static <T extends Kucing> double Bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}