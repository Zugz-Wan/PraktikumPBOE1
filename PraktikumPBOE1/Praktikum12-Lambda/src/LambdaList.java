/* Nama File    : LambdaList.java
 * Deskripsi    : Implementasi lambda sebagai parameter method pada List.
 *                Menggunakan forEach() dengan lambda untuk mencetak elemen ArrayList.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 4 Juni 2026
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        System.out.println("Daftar Mahasiswa:");
        // Lambda digunakan sebagai parameter forEach
        mahasiswaList.forEach((nama) -> System.out.println("- " + nama));

        // Contoh lambda dengan filter (method reference)
        System.out.println("\nMahasiswa yang namanya diawali huruf B atau C:");
        mahasiswaList.stream()
            .filter(nama -> nama.startsWith("B") || nama.startsWith("C"))
            .forEach(nama -> System.out.println("- " + nama));
    }
}
