/**
 * File         : MainDAO.java
 * Deskripsi    : Main program untuk akses DAO
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Rabu, 20 Mei 2026
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MYSQLPersonDAO());
        
        try {
            m.getPersonDAO().savePerson(person);
            System.out.println("Data person berhasil disimpan ke database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}