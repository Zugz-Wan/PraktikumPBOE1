public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("12345", "Andi", "Teknik Informatika");
        Dosen dosen1 = new Dosen("Budi", "67890", "Teknik Informatika");
        Kendaraan kendaraan1 = new Kendaraan("B 1234 CD", "Motor"); 
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);  
        MataKuliah matkul1 = new MataKuliah("09854","Pemrograman", 3);
        MataKuliah matkul2 = new MataKuliah("09855","Struktur Data", 4);
        mhs1.getListMatkul().add(matkul1);
        mhs1.getListMatkul().add(matkul2);
        mhs1.printDetailMhs();
        System.out.println("Jumlah SKS: " + mhs1.getJumlahSKS());
        System.out.println("Jumlah Mata Kuliah: " + mhs1.getJumlahMatkul());   
    }
}
