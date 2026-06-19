/* Nama File    : Burung.java
 * Deskripsi    : Membuat class Burung sebagai subclass dari Anabul dengan mengoverride method gerak dan bersuara 
                  untuk memberikan perilaku yang spesifik pada burung. Method gerak akan menampilkan bahwa burung 
                  bergerak dengan terbang, sedangkan method bersuara akan menampilkan bahwa burung berbunyi cuit.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}