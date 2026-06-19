/* Nama File    : LambdaMap.java
 * Deskripsi    : Implementasi lambda pada Map.
 *                Menggunakan forEach() dengan lambda untuk mencetak pasangan key-value
 *                dari HashMap yang berisi NIM dan nama mahasiswa.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 4 Juni 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Map dengan key = NIM dan value = Nama
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124120020", "Raffi Arditama");
        mahasiswaMap.put("24060124120021", "Bambang Santoso");
        mahasiswaMap.put("24060124120022", "Cici Wijaya");
        mahasiswaMap.put("24060124120023", "Dodi Pranata");

        System.out.println("Daftar Mahasiswa:");
        // Lambda digunakan untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) ->
            System.out.println("NIM : " + nim + " | Nama : " + nama)
        );
    }
}
