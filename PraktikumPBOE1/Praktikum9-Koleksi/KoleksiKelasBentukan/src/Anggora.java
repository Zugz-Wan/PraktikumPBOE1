/* Nama File    : Anggora.java
 * Deskripsi    : Membuat class Anggora sebagai subclass dari Kucing dengan mengoverride method bersuara untuk memberikan perilaku 
                  yang spesifik pada kucing Anggora. Method bersuara akan menampilkan bahwa kucing Anggora berbunyi meong lembut.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
 */

public class Anggora extends Kucing {

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " (Anggora) berbunyi meong lembut");
    }
}