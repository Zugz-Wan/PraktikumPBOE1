// File      : DosenTamu.java
// Deskripsi : Kelas DosenTamu mewarisi Dosen
//             Tidak punya BUP; punya tanggal akhir kontrak
//             Tunjangan = 2.5% x gaji pokok
// Pembuat   : Raffi Arditama
// Tanggal   : 16 Maret 2026

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu() {}

    public DosenTamu(String nip, String nidk, String nama,
                     LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas,
                     LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public String getNidk()                        { return nidk; }
    public void   setNidk(String nidk)             { this.nidk = nidk; }

    public LocalDate getTanggalAkhirKontrak()      { return tanggalAkhirKontrak; }
    public void setTanggalAkhirKontrak(LocalDate d){ this.tanggalAkhirKontrak = d; }

    // Sisa kontrak dari tanggal sekarang sampai akhir kontrak
    public int getSisaKontrakBulan() {
        Period p = Period.between(TANGGAL_SEKARANG, tanggalAkhirKontrak);
        return p.getYears() * 12 + p.getMonths();
    }

    // Tunjangan = 2.5% x gaji pokok
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP              : " + nip);
        System.out.println("NIDK             : " + nidk);
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Lahir    : " + formatTanggal(tanggalLahir));
        System.out.println("TMT              : " + formatTanggal(tmt));
        System.out.println("Jabatan          : Dosen Tamu");
        System.out.println("Fakultas         : " + fakultas);
        System.out.println("Masa Kerja       : " + getMasaKerjaTahun()
                           + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Akhir Kontrak    : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Sisa Kontrak     : " + getSisaKontrakBulan() + " bulan");
        System.out.println("Gaji Pokok       : " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan        : 2.5% x " + formatRupiah(gajiPokok)
                           + " = " + formatRupiah(getTunjangan()));
    }
}