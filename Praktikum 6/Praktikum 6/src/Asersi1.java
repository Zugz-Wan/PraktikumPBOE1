/**
 * File        : Asersi1.java
 * Deskripsi   : Program untuk menunjukkan asersi
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            // Asersi ini akan GAGAL jika x == 0 dan assertions diaktifkan
            // karena kondisinya x < 0, padahal x = 0
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}