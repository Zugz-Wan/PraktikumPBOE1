/* Nama File    : Anabul.java
 * Deskripsi    : Membuat class Anabul sebagai kelas dasar untuk berbagai jenis hewan peliharaan (Anabul = Anak Bulu) 
                  dengan atribut nama dan method gerak serta bersuara. Kelas ini akan menjadi parent class untuk kelas Anjing dan Burung
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }   
    
    public abstract void gerak();
    public abstract void bersuara();

    public void infoTambahan() {
        // kosong
    }
}
