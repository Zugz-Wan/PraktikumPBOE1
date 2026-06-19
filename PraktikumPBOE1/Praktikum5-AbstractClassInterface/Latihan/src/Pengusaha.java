/* Nama File    : Pengusaha.java
 * Deskripsi    : Subclass dari Manusia yang mengimplementasi interface Pajak.
 *                Pengusaha memiliki atribut NPWP dan tarif pajak 15% dari pendapatan.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 16 April 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha;
    private static final int BONUS_MASA_KERJA = 2;

    public Pengusaha() {
        super();
        npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() { return this.npwp; }
    public void setNpwp(String npwp) { this.npwp = npwp; }
    public static int getCounterPengusaha() { return counterPengusaha; }

    @Override
    public int hitungMasaKerja() {
        Period period = Period.between(getTgl_mulai_kerja(), LocalDate.now());
        return period.getYears() + BONUS_MASA_KERJA;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.15; // 15% untuk Pengusaha
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP              : " + npwp);
        System.out.println("Masa Kerja        : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak             : Rp " + String.format("%,.0f", hitungPajak()));
    }
}
