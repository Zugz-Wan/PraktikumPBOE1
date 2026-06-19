/**
 * File         : ReadSerializedPerson.java
 * Deskripsi    : Program untuk deserialisasi objek Person
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Rabu, 20 Mei 2026
 */

import java.io.*;

public class ReadSerializedPerson{
    public static void main(String[] args){
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}