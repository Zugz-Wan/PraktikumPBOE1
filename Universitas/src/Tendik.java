// File      : Tendik.java
// Deskripsi : Kelas Tendik (Tenaga Kependidikan) mewarisi Pegawai
//             BUP 55 tahun, tunjangan = 1% x masa kerja (tahun) x gaji pokok
//             Bidang: Akademik | Kemahasiswaan | Sumber Daya
// Pembuat   : Raffi Arditama
// Tanggal   : 16 Maret 2026

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private static final int BUP = 55;

    // Enum bidang kerja
    public enum Bidang { AKADEMIK, KEMAHASISWAAN, SUMBER_DAYA }

    private Bidang bidang;

    public Tendik() {}

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, Bidang bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public Bidang getBidang()            { return bidang; }
    public void   setBidang(Bidang b)    { this.bidang = b; }

    // Tanggal pensiun: tanggal lahir + BUP, lalu tanggal 1 bulan berikutnya
    public LocalDate getTanggalPensiun() {
        LocalDate bup = tanggalLahir.plusYears(BUP);
        return bup.plusMonths(1).withDayOfMonth(1);
    }

    // Tunjangan = 1% x masa kerja tahun x gaji pokok
    public double getTunjangan() {
        return 0.01 * getMasaKerjaTahun() * gajiPokok;
    }

    // Nama bidang string
    private String namaBidang() {
        switch (bidang) {
            case AKADEMIK:       return "Akademik";
            case KEMAHASISWAAN:  return "Kemahasiswaan";
            case SUMBER_DAYA:    return "Sumber Daya";
            default:             return "-";
        }
    }

    @Override
    public void printInfo() {
        System.out.println("NIP            : " + nip);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + formatTanggal(tanggalLahir));
        System.out.println("TMT            : " + formatTanggal(tmt));
        System.out.println("Jabatan        : Tenaga Kependidikan");
        System.out.println("Bidang         : " + namaBidang());
        System.out.println("Masa Kerja     : " + getMasaKerjaTahun()
                           + " tahun " + getMasaKerjaBulan() + " bulan");
        System.out.println("Tanggal Pensiun: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok     : " + formatRupiah(gajiPokok));

        int tahun = getMasaKerjaTahun();
        double tunjangan = getTunjangan();
        System.out.println("Tunjangan      : 1% x " + tahun
                           + " x " + formatRupiah(gajiPokok)
                           + " = " + formatRupiah(tunjangan));
    }
}