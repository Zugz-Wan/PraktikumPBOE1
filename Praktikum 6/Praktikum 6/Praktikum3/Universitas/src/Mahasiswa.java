import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    public Mahasiswa() {
        this(null, null, null);
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah matkul) {
        this.listMatkul.add(matkul);
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatkul() {
        return this.listMatkul.size();
    }   

    public void printMhs() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
    }


     public void printDetailMhs() {
        printMhs();
        System.out.println("Dosen Wali: " + this.dosenWali.getNama());
        System.out.println("Kendaraan: " + this.kendaraan.getJenis() + " dengan No. Plat " + this.kendaraan.getNoPlat());
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah matkul : listMatkul) {
            System.out.println("- " + matkul.getNama() + " (" + matkul.getSks() + " SKS)");
        }
     }
}
