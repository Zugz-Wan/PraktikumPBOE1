/*Nama File : Titik.java
  Pembuat   : Raffi Arditama
  NIM       : 24060124120020
  Deskripsi : Program untuk menampilkan titik pada layar
  Tanggal   : 19 Februari 2026
 */

public class Titik {
    // Atribut
    double absis;
    double ordinat;

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double a) {
        absis = a;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }

    void geser (double x, double y) {
        absis += x;
        ordinat += y;
    }

    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
