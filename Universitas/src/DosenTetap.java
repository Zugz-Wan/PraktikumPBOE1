// File      : DosenTetap.java
// Deskripsi : Kelas DosenTetap mewarisi Dosen
//             BUP 65 tahun, tunjangan = 2% x masa kerja (tahun) x gaji pokok
// Pembuat   : Raffi Arditama
// Tanggal   : 16 Maret 2026

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private static final int BUP = 65;
    private String nidn;

    public DosenTetap() {}

    public DosenTetap(String nip, String nidn, String nama,
                      LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn()             { return nidn; }
    public void   setNidn(String nidn)  { this.nidn = nidn; }

    // Tanggal pensiun: tanggal lahir + BUP, lalu tanggal 1 bulan berikutnya
    public LocalDate getTanggalPensiun() {
        LocalDate bup = tanggalLahir.plusYears(BUP);
        // "tanggal 1 bulan berikutnya"
        return bup.plusMonths(1).withDayOfMonth(1);
    }

    // Tunjangan = 2% x masa kerja tahun x gaji pokok
    public double getTunjangan() {
        return 0.02 * getMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP          : " + nip);
        System.out.println("NIDN         : " + nidn);
        System.out.println("Nama         : " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT          : " + formatTanggal(tmt));
        System.out.println("Jabatan      : Dosen Tetap");
        System.out.println("Fakultas     : " + fakultas);
        System.out.println("Masa Kerja   : " + getMasaKerjaTahun()
                           + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok   : " + formatRupiah(gajiPokok));

        int tahun = getMasaKerjaTahun();
        double tunjangan = getTunjangan();
        System.out.println("Tunjangan    : 2% x " + tahun
                           + " x " + formatRupiah(gajiPokok)
                           + " = " + formatRupiah(tunjangan));
    }
}