/**
 * File        : AngkaSial.java
 * Deskripsi   : Program penggunaan exception buatan sendiri
 *               Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException(); // lempar exception ke pemanggil
        }
        System.out.println(angka + " bukan angka sial"); // baris 12
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);  // OK → cetak "10 bukan angka sial"
            as.cobaAngka(13);  // Exception dilempar di sini!
            as.cobaAngka(12);  // TIDAK dieksekusi karena exception terjadi di baris sebelumnya
        } catch (AngkaSialException ase) { // baris 21
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
 * JAWABAN PERTANYAAN:
 *
 * Q: Ketika eksepsi terjadi (saat cobaAngka(13)), apakah baris 12 dieksekusi?
 * A: TIDAK. Begitu "throw new AngkaSialException()" dieksekusi pada baris 10,
 *    eksekusi method cobaAngka() langsung berhenti dan lompat ke catch block.
 *    Baris 12 (println "bukan angka sial") dilewati sepenuhnya.
 *
 * Q: Apakah baris 21 (catch block) dieksekusi?
 * A: YA. Ketika AngkaSialException dilempar oleh cobaAngka(13), JVM mencari
 *    catch block yang sesuai di try-catch block tempat method itu dipanggil.
 *    Blok catch (AngkaSialException ase) pada baris 21 cocok, sehingga
 *    dieksekusi → mencetak pesan exception dan "hati-hati memasukkan angka!!!".
 */