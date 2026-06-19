/* Nama File    : MManusia.java
 * Deskripsi    : Kelas utama untuk menguji hirarki Manusia (Pengusaha, Petani, PNS)
 *                beserta implementasi interface Pajak.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 16 April 2026
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        Pengusaha p1 = new Pengusaha("Budi Santoso", LocalDate.of(2020, 1, 1),
                "Jl. Merdeka No. 1", 1_000_000_000.0, "PT. Maju Jaya");
        Petani t1 = new Petani("Siti Aminah", LocalDate.of(2019, 3, 1),
                "Jl. Gatot Subroto No. 3", 2_000_000.0, "Semarang");
        PNS n1 = new PNS("Andi Prasetyo", LocalDate.of(2018, 4, 1),
                "Jl. Thamrin No. 4", 7_000_000.0, "Kementerian Pendidikan");

        System.out.println("========== DATA PENGUSAHA ==========");
        p1.cetakInfo();

        System.out.println("\n========== DATA PETANI ==========");
        t1.cetakInfo();

        System.out.println("\n========== DATA PNS ==========");
        n1.cetakInfo();

        System.out.println("\n========== STATISTIK ==========");
        System.out.println("Total Manusia yang dibuat : " + Manusia.getCounterMns());
    }
}
