// File      : MUniv.java
// Deskripsi : Main class untuk menguji semua jenis pegawai
// Pembuat   : Raffi Arditama
// Tanggal   : 16 Maret 2026

import java.time.LocalDate;

public class MUniv {
    public static void main(String[] args) {

        // 1. DOSEN TETAP 
        DosenTetap dt = new DosenTetap(
            "9545647548",               // NIP
            "78647324",                  // NIDN
            "Andi",                      // Nama
            LocalDate.of(1990, 5, 5),    // Tanggal Lahir: 5 Mei 1990
            LocalDate.of(2015, 1, 1),    // TMT: 1 Januari 2015
            5_000_000,                   // Gaji Pokok
            "Fakultas Sains dan Matematika"
        );

        System.out.println("========== DOSEN TETAP ==========");
        dt.printInfo();

        System.out.println();

        // 2. DOSEN TAMU
        DosenTamu dtu = new DosenTamu(
            "8812345678",               // NIP
            "90123456",                  // NIDK
            "Budi Santoso",              // Nama
            LocalDate.of(1985, 8, 20),   // Tanggal Lahir
            LocalDate.of(2022, 3, 1),    // TMT
            4_500_000,                   // Gaji Pokok
            "Fakultas Teknik",           // Fakultas
            LocalDate.of(2026, 2, 28)    // Tanggal Akhir Kontrak
        );

        System.out.println("========== DOSEN TAMU ==========");
        dtu.printInfo();

        System.out.println();

        // 3. TENDIK
        Tendik tendik = new Tendik(
            "7700112233",               // NIP
            "Citra Dewi",                // Nama
            LocalDate.of(1980, 11, 15),  // Tanggal Lahir
            LocalDate.of(2010, 7, 1),    // TMT
            3_800_000,                   // Gaji Pokok
            Tendik.Bidang.AKADEMIK       // Bidang
        );

        System.out.println("========== TENDIK ==========");
        tendik.printInfo();
    }
}