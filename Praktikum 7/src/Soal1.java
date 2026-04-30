// NIM    : (isi NIM kamu)
// Nama   : (isi Nama kamu)
// Tanggal: (isi tanggal)
// Praktikum PBO - Soal 1: Polimorfisme Ad Hoc Coercion

public class Soal1 {
    public static void main(String[] args) {

        // ── (a) Ilustrasi coercion dasar ──────────────────────────────────
        System.out.println("=== (a) Coercion Dasar ===");
        int    angkaInt  = 65;
        char   angkaChar = (char) angkaInt;   // int → char
        double angkaReal = (double) angkaInt; // int → double

        System.out.println("Sebagai int    : " + angkaInt);
        System.out.println("Sebagai char   : " + angkaChar);
        System.out.println("Sebagai double : " + angkaReal);

        // ── (b) Real dikembalikan ke int di variabel berbeda ─────────────
        System.out.println("\n=== (b) Double kembali ke int ===");
        double nilaiReal  = 65.9;
        int    nilaiInt2  = (int) nilaiReal;  // truncate, bukan round
        System.out.println("double asli : " + nilaiReal);
        System.out.println("Setelah cast ke int : " + nilaiInt2);

        // ── (c) String X & Y → konkatenasi S, penjumlahan Z ─────────────
        System.out.println("\n=== (c) String X dan Y ===");
        String  X = "1234";
        String  Y = "5678";
        String  S = X + Y;                          // konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // penjumlahan
        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("Konkatenasi S = " + S);
        System.out.println("Penjumlahan Z = " + Z);

        // ── (d) String P & Q → konkatenasi R, penjumlahan D ─────────────
        System.out.println("\n=== (d) String P dan Q ===");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;                              // konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // penjumlahan
        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("Konkatenasi R = " + R);
        System.out.println("Penjumlahan D = " + D);

        // ── (e) Integer A dari konversi S ────────────────────────────────
        System.out.println("\n=== (e) Integer A dari S ===");
        Integer A = Integer.parseInt(S);
        System.out.println("A = " + A);

        // ── (f) String T dari konversi A ─────────────────────────────────
        System.out.println("\n=== (f) String T dari A ===");
        String T = A.toString();
        System.out.println("T = " + T);
        System.out.println("Tipe T = String? " + (T instanceof String));
    }
}
