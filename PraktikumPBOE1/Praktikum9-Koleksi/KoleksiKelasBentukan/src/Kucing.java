/* Nama File    : Kucing.java
 * Deskripsi    : Membuat class Kucing sebagai subclass dari Anabul dengan mengoverride method gerak dan bersuara 
                  untuk memberikan perilaku yang spesifik pada kucing. Method gerak akan menampilkan bahwa kucing 
                  bergerak dengan melata, sedangkan method bersuara akan menampilkan bahwa kucing berbunyi meong.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
    
    @Override
    public void infoTambahan() {
        System.out.println("Bobot: " + bobot + " kg");
    }
}