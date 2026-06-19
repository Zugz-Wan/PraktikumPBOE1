/* Nama File    : DiskonLambda.java
 * Deskripsi    : Mendemonstrasikan ekspresi lambda dasar di Java.
 *                Tiga cara mendefinisikan implementasi interface fungsional IDiskon:
 *                (1) anonymous class, (2) lambda ringkas, (3) lambda blok statement.
 *                Contoh kasus: menghitung harga setelah diskon.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 4 Juni 2026
 */

interface IDiskon {
    double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // 1. Tanpa lambda — anonymous class
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // 2. Dengan lambda (ekspresi ringkas)
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // 3. Dengan lambda (blok statement)
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Harga awal       : Rp 45.000");
        System.out.println("Diskon Merdeka   : Rp " + String.format("%,.0f", diskonMerdeka.hitungDiskon(45000)));
        System.out.println("Diskon Lebaran   : Rp " + String.format("%,.0f", diskonLebaran.hitungDiskon(45000)));
        System.out.println("Diskon Biasa     : Rp " + String.format("%,.0f", diskonBiasa.hitungDiskon(45000)));
    }
}
