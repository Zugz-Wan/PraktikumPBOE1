/* Nama File    : MPiaraan.java
 * Deskripsi    : Membuat class MPiaraanBaru sebagai kelas utama untuk menjalankan program yang menguji fungsionalitas class Piaraan dan berbagai jenis Anabul.
 *               Dalam method main, kita membuat objek-objek Anabul seperti Anjing, Burung, Kucing, Anggora, dan KembangTelon, kemudian menambahkan mereka ke dalam antrian Piaraan.
 *               Program ini juga menampilkan daftar Anabul, jumlah elemen dalam antrian, Anabul pertama, jumlah keluarga kucing, total bobot keluarga kucing, jenis tiap Anabul,
 *               serta melakukan operasi dequeue dan menampilkan isi antrean setelahnya.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
*/

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();
        Anjing a1 = new Anjing("Buddy");
        Burung b1 = new Burung("Cici");
        Kucing k1 = new Kucing("Luna", 2.7);
        Anggora a2 = new Anggora("Snowy", 4.5);
        KembangTelon k2 = new KembangTelon("Sandy", 3.2);

        p.enqueueAnabul(a1);
        p.enqueueAnabul(b1);
        p.enqueueAnabul(k1);
        p.enqueueAnabul(a2);
        p.enqueueAnabul(k2);

        System.out.println("Daftar Anabul:");
        p.showAnabul();
        System.out.println("\nJumlah elemen:");
        System.out.println(p.getNbelm());
        System.out.println("\nAnabul pertama:");
        System.out.println(p.getAnabul().getNama());
        System.out.println("\nJumlah keluarga kucing:");
        System.out.println(p.countKucing());
        System.out.println("\nTotal bobot keluarga kucing:");
        System.out.println(p.bobotKucing() + " kg");
        System.out.println("\nJenis tiap Anabul:");
        p.showJenisAnabul();
        System.out.println("\nDequeue:");
        System.out.println(p.dequeueAnabul().getNama());
        System.out.println("\nIsi antrean sekarang:");
        p.showAnabul();
    }
}
