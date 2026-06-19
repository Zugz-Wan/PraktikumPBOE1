/* Nama File    : KembangTelon.java
 * Deskripsi    : Membuat class KembangTelon sebagai subclass dari Kucing dengan mengoverride method bersuara untuk memberikan perilaku 
                  yang spesifik pada kucing KembangTelon. Method bersuara akan menampilkan bahwa kucing KembangTelon berbunyi meong khas.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class KembangTelon extends Kucing {

    public KembangTelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (KembangTelon) berbunyi meong khas");
    }
}