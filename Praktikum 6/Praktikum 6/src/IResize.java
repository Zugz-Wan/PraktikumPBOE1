/**
 * File        : IResize.java
 * Deskripsi   : Interface yang menunjukkan suatu objek dapat di-resize
 * Pembuat     : [Nama Anda]
 * Tanggal     : 2025
 */


public interface IResize {
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Menskalakan ukuran sesuai input percent yang diberikan
    public void zoom(int percent);
}