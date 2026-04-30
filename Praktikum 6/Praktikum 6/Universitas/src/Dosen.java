// File      : Dosen.java
// Deskripsi : Kelas abstrak Dosen, mewarisi Pegawai
// Pembuat   : Raffi Arditama
// Tanggal   : 16 Maret 2026

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen() {}

    public Dosen(String nip, String nama, LocalDate tanggalLahir,
                 LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas()              { return fakultas; }
    public void   setFakultas(String f)      { this.fakultas = f; }

    // printInfo tetap abstract, diimplementasikan oleh DosenTetap & DosenTamu
}