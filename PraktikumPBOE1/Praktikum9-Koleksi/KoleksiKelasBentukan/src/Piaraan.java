/* Nama File    : Piaraan.java
 * Deskripsi    : Membuat class Piaraan yang berfungsi sebagai antrian untuk menyimpan objek-objek Anabul. Class ini memiliki atribut nbelm 
                  untuk menghitung jumlah Anabul dalam antrian dan lAnabul sebagai struktur data Queue untuk menyimpan objek-objek Anabul. 
                  Class ini juga memiliki beberapa method seperti enqueueAnabul untuk menambahkan Anabul ke dalam antrian, 
                  isMember untuk memeriksa apakah suatu Anabul ada dalam antrian, getAnabul untuk melihat Anabul yang berada di depan antrian, 
                  dequeueAnabul untuk mengeluarkan Anabul dari antrian, showAnabul untuk menampilkan semua Anabul dalam antrian, countKucing 
                  untuk menghitung jumlah Kucing dalam antrian, bobotKucing untuk menghitung total bobot Kucing dalam antrian, dan showJenisAnabul 
                  untuk menampilkan jenis Anabul beserta namanya.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 7 Mei 2026
*/

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> lAnabul;

    public Piaraan() {
        lAnabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        lAnabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return lAnabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return lAnabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul temp = lAnabul.poll();
        if (temp != null) {
            nbelm--;
        }
        return temp;
    }

    public void showAnabul() {
        for (Anabul a : lAnabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : lAnabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for (Anabul a : lAnabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : lAnabul) {
            System.out.println(
                a.getNama() + " -> " +
                a.getClass().getSimpleName()
            );
        }
    }
}