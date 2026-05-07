public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(); // Membuat titik (0,0)
        t1.setAbsis(3); // Mengubah absis t1 menjadi 3
        t1.setOrdinat(4); // Mengubah ordinat t1 menjadi 4
        t1.printTitik(); // Output: Titik (3.0,4.0) 
        t1.geser(3, 4); // Menggeser t1 sebesar (3,4)
        t1.printTitik(); // Output: Titik (6.0,8.0)
    }
}
