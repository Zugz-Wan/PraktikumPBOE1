/**
 * File         : SerializePerson.java
 * Deskripsi    : Program untuk serialisasi objek Person
 * Pembuat      : Raffi Arditama
 * NIM          : 24060124120020
 * Tanggal      : Rabu, 20 Mei 2026
 */

import java.io.*;

//class SerializePerson
public class SerializePerson{
    public static void main(String[] args){
        Person person = new Person("Panji");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}