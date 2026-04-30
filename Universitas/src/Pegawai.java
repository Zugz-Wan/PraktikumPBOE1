// File      : Pegawai.java
// Deskripsi : Superclass untuk semua jenis pegawai perguruan tinggi
// Pembuat   : raffi Arditama
// Tanggal   : 16 Maret 2026

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // Nama-nama bulan dalam Bahasa Indonesia
    private static final String[] NAMA_BULAN = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni",
        "Juli", "Agustus", "September", "Oktober", "November", "Desember"
    };

    public Pegawai() {}

    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Getter & Setter
    public String getNip()                      { return nip; }
    public void   setNip(String nip)            { this.nip = nip; }

    public String getNama()                     { return nama; }
    public void   setNama(String nama)          { this.nama = nama; }

    public LocalDate getTanggalLahir()          { return tanggalLahir; }
    public void   setTanggalLahir(LocalDate d)  { this.tanggalLahir = d; }

    public LocalDate getTmt()                   { return tmt; }
    public void   setTmt(LocalDate tmt)         { this.tmt = tmt; }

    public double getGajiPokok()                { return gajiPokok; }
    public void   setGajiPokok(double g)        { this.gajiPokok = g; }

    // Format Tanggal
    public static String formatTanggal(LocalDate date) {
        if (date == null) return "-";
        return date.getDayOfMonth() + " "
                + NAMA_BULAN[date.getMonthValue() - 1]
                + " " + date.getYear();
    }

    //  hitung masa kerja dari TMT 
    public static final LocalDate TANGGAL_SEKARANG = LocalDate.now();

    public int getMasaKerjaTahun() {
        return Period.between(tmt, TANGGAL_SEKARANG).getYears();
    }

    public int getMasaKerjaBulan() {
        return Period.between(tmt, TANGGAL_SEKARANG).getMonths();
    }

    //  format rupiah
    public static String formatRupiah(double nominal) {
        long n = (long) nominal;
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.insert(0, s.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) sb.insert(0, '.');
        }
        return "Rp " + sb.toString() + ",00";
    }

    public abstract void printInfo();
}