/**
 * File        : ExceptionOnArray.java
 * Deskripsi   : Program penggunaan eksepsi menggunakan class library Java

 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer ukuran 4 (index 0-3)
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;  // OK — index valid
            arrayInteger[4] = 10;  // ArrayIndexOutOfBoundsException! index 4 tidak ada
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            // Blok finally SELALU dieksekusi, baik exception terjadi maupun tidak
            System.out.println("clean up code...");
        }
    }
}