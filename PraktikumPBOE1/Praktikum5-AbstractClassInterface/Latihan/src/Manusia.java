/* Nama File    : Manusia.java
 * Deskripsi    : Abstract class Manusia sebagai parent dari Pengusaha, Petani, dan PNS.
 *                Menyimpan atribut umum seperti nama, tanggal mulai kerja, alamat, dan pendapatan.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 16 April 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns;

    public Manusia() {
        this("", LocalDate.now(), "", 0.0);
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() { return this.nama; }
    public void setNama(String nama) { this.nama = nama; }

    public LocalDate getTgl_mulai_kerja() { return this.tgl_mulai_kerja; }
    public void setTgl_mulai_kerja(LocalDate tgl) { this.tgl_mulai_kerja = tgl; }

    public String getAlamat() { return this.alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public double getPendapatan() { return this.pendapatan; }
    public void setPendapatan(double pendapatan) { this.pendapatan = pendapatan; }

    public static int getCounterMns() { return counterMns; }

    public void cetakInfo() {
        System.out.println("Nama              : " + this.nama);
        System.out.println("Tgl Mulai Kerja   : " + this.tgl_mulai_kerja);
        System.out.println("Alamat            : " + this.alamat);
        System.out.println("Pendapatan        : Rp " + String.format("%,.0f", this.pendapatan));
    }

    // Abstract method — wajib diimplementasi subclass
    public abstract int hitungMasaKerja();
}
