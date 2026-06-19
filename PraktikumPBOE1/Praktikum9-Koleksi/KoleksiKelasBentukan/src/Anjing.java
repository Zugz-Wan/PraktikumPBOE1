/* Nama File    : Anjing.java
 * Deskripsi    : Membuat class Anjing sebagai subclass dari Anabul dengan mengoverride method gerak dan bersuara 
                  untuk memberikan perilaku yang spesifik pada anjing. Method gerak akan menampilkan bahwa anjing 
                  bergerak dengan melata, sedangkan method bersuara akan menampilkan bahwa anjing berbunyi guk-guk.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi guk-guk");
    }
}