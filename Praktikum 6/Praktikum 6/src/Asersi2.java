/**
 * File        : Asersi2.java
 * Deskripsi   : Program untuk demo asersi, yang akan menolak input
 *               jari-jari lingkaran yang bernilai nol
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!!";
        Lingkaran l      = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
 * JAWABAN PERTANYAAN — Apa yang kurang tepat pada Asersi2?
 *
 * Secara konsep, assert SEHARUSNYA digunakan untuk mengecek
 * kondisi INTERNAL yang "pasti tidak akan salah jika logika program benar",
 * bukan untuk validasi INPUT pengguna.
 *
 * Masalahnya:
 * 1. Assertions DINONAKTIFKAN by default saat runtime ("java Asersi2").
 *    Artinya jari-jari = 0 tetap diteruskan → keliling = 0 tanpa pesan error.
 * 2. Validasi input user seharusnya menggunakan Exception (throw
 *    IllegalArgumentException), bukan assert.
 * 3. Assert cocok untuk postcondition/invariant internal, bukan input checking.
 */