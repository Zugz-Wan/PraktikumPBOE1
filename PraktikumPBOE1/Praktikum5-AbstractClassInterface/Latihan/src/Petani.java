/* Nama File    : Petani.java
 * Deskripsi    : Subclass dari Manusia yang mengimplementasi interface Pajak.
 *                Petani memiliki atribut asal_kota dan tidak dikenakan pajak (0%).
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Kamis, 16 April 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani;

    public Petani() {
        super();
        asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota() { return this.asal_kota; }
    public void setAsal_kota(String asal_kota) { this.asal_kota = asal_kota; }
    public static int getCounterPetani() { return counterPetani; }

    @Override
    public int hitungMasaKerja() {
        Period period = Period.between(getTgl_mulai_kerja(), LocalDate.now());
        return period.getYears();
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota         : " + asal_kota);
        System.out.println("Masa Kerja        : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak             : Rp 0 (bebas pajak)");
    }
}
