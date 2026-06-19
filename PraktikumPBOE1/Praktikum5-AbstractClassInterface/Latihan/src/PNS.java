/* Nama File    : PNS.java
 * Deskripsi    : Subclass dari Manusia yang mengimplementasi interface Pajak.
 *                PNS memiliki atribut NIP dan tarif pajak 10% dari pendapatan.
 *                Masa kerja PNS mendapat bonus 6 tahun.
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 16 April 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;
    private static final int BONUS_MASA_KERJA = 6;

    public PNS() {
        super();
        nip = "";
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() { return this.nip; }
    public void setNip(String nip) { this.nip = nip; }
    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasaKerja() {
        Period period = Period.between(getTgl_mulai_kerja(), LocalDate.now());
        return period.getYears() + BONUS_MASA_KERJA;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.10; // 10% untuk PNS
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP               : " + nip);
        System.out.println("Masa Kerja        : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak             : Rp " + String.format("%,.0f", hitungPajak()));
    }
}
